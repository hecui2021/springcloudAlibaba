package com.study.aop;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.study.pojo.LogBean;
import com.study.pojo.Response;
import com.study.util.MdcUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * 对于 controller 入口的处理，包括限流、MDC 初始化、出入日志打印、监控上报、返回结构包装
 */
@Aspect
@Component
public class ControllerAspect {

    private static final Logger log = LoggerFactory.getLogger(ControllerAspect.class);

    // 专用日志输出器
    private final Logger passiveLog = LoggerFactory.getLogger("passive");

    /**
     * 匹配的所有 controller 方法 此处需要根据业务不同调整对应切面 要求 controller 返回结构为 `Response`
     */
    @Pointcut("execution(public * com.study..*Controller.*(..))")
    public void targetAspect() {
    }

    /**
     * 环绕通知
     * @param joinPoint
     * @return
     */
    @Around("targetAspect()")
    public Object around(ProceedingJoinPoint joinPoint) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();

        // 判断是否文件上传（文件上传时req无法序列化）
        boolean isMultipart = ServletFileUpload.isMultipartContent(httpServletRequest);

        // 初始化MDC
        String traceId = httpServletRequest.getHeader("x-trace-id");
        if (StringUtils.isBlank(traceId)) {
            traceId = UUID.randomUUID().toString().replaceAll("-", "");
        }
        MDC.put("trace-id", traceId);

        LogBean logBean = new LogBean();
        logBean.setTraceId(traceId);
        logBean.setCmd(httpServletRequest.getRequestURI());
        logBean.setClientIP(httpServletRequest.getRemoteAddr());
        logBean.setSvc("boss-server");
        logBean.setReqTime(System.currentTimeMillis());
        if (!isMultipart) {
            logBean.setReqStr(JSONObject.toJSONString(joinPoint.getArgs()));
        }


        // 错误处理
        Response<Object> rsp = null;
        Object res = null;
        try {
            res = joinPoint.proceed();
            if (res instanceof Response) {
                rsp = (Response<Object>) res;
            } else {
                rsp = new Response<>(res);
            }
        } catch (Throwable t) {
            log.error("error when process request", t);
            rsp = new Response<>();
        } finally {
            MDC.clear();

            long endTime = System.currentTimeMillis();
            long cost = endTime - logBean.getReqTime();

            logBean.setRespTime(endTime);
            logBean.setCost(cost);
            // 返回信息填充
            rsp.setTraceId(MdcUtil.getTraceId());
            logBean.setRespStr(JSON.toJSONString(rsp));
            // 输出最终的日志对象
            passiveLog.trace(JSON.toJSONString(logBean));
        }

        if (res instanceof Response) {
            return rsp;
        } else {
            // 对响应体类型有要求的请求，需要返回本来的响应体类型
            return rsp.getData();
        }
    }

}
