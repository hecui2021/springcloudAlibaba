package com.study.aop;


import com.alibaba.fastjson.JSONObject;
import com.study.pojo.Response;
import com.study.util.MdcUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

/**
 * 对于 controller 入口的处理，包括限流、MDC 初始化、出入日志打印、监控上报、返回结构包装
 */
@Aspect
@Component
public class ControllerAspect {

    private static final Logger log = LoggerFactory.getLogger(ControllerAspect.class);

    /**
     * 匹配的所有 controller 方法 此处需要根据业务不同调整对应切面 要求 controller 返回结构为 `Response`
     */
    @Pointcut("execution(public * com.lix7.bossserver..*Controller.*(..))")
    public void targetAspect() {
    }

    /**
     * 环绕通知
     * @param joinPoint
     * @return
     */
    @Around("targetAspect()")
    public Object around(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().toString();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();

        String path = httpServletRequest.getRequestURI();
        String matchedPathPattern = (String) httpServletRequest.getAttribute(
            HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE
        );
        String clientIp = httpServletRequest.getRemoteAddr();

        // 初始化MDC
        String traceId = httpServletRequest.getHeader("x-trace-id");
        MdcUtil.init(path, clientIp, traceId);

        // access日志
        log.info(
            "request controller path: {}, controller method: {}, controller args: {}, clientIp: {}",
            matchedPathPattern,
            methodName,
            joinPoint.getArgs(),
            clientIp
        );

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
            if (rsp.getStatus() == null) {
                rsp.setStatus(0).setMessage("success");
            }
        } catch (Throwable t) {
            log.error("error when process request", t);
            rsp = new Response<>();

//            if (t instanceof ApiException) {
//                // 已知业务异常返回业务错误码和错误信息
//                ApiException e = (ApiException) t;
//                rsp.setStatus(e.getCode()).setMessage(e.getMessage());
//            } else {
//                // 未知错误返回「系统错误」
//                rsp.setStatus(ApiCode.SYSTEM_ERROR.getCode())
//                    .setMessage(ApiCode.SYSTEM_ERROR.getMessage());
//            }
            res = rsp;
        }

        // 返回信息填充
        rsp.setTraceId(MdcUtil.getTraceId())
            .setTimestamp(MdcUtil.getRequestTime())
            .setCost(Instant.now().toEpochMilli() - MdcUtil.getRequestTime())
            .setHost(System.getProperty("POD_IP", "0.0.0.0"));

        // log
        log.info("done controller request, rsp: {}", JSONObject.toJSONString(rsp));

        MdcUtil.clear();

        if (res instanceof Response) {
            return rsp;
        } else {
            // 对响应体类型有要求的请求，需要返回本来的响应体类型
            return rsp.getData();
        }
    }

}
