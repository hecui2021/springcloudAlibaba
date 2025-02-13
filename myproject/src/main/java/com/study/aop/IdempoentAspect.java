package com.study.aop;

import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: peterche
 * @Description: aop实现自定义注解接口幂等性校验
 * @Date: 2023/5/28 16:34
 */
@Component
@Aspect
public class IdempoentAspect {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Pointcut("@annotation(com.study.annotation.Idempoent)")
    public void pointCut() {

    }

//    @Before("pointCut()")
//    public void before(JoinPoint joinPoint) {
//        //拿到当前请求request
//        HttpServletRequest request =
//                ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//
//        String token = request.getHeader("token");
//        if (StringUtils.isEmpty(token)) {
//            throw new RuntimeException("非法参数");
//        }
//        Boolean delete = stringRedisTemplate.delete(token);
//        if (!delete) {
//            // 重复请求
//            throw new RuntimeException("重复请求");
//        }
//
//    }


}
