package com.study.interceptor;//package com.study.interceptor;
//
//import com.study.annotation.Idempoent;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.lang.reflect.Method;
//
///**
// * @Author: peterche
// * @Description:
// * @Date: 2023/5/28 16:10
// */
//public class IdempoentInterceptor implements HandlerInterceptor {
//
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        if (!(handler instanceof HandlerMethod)) {
//            return true;
//        }
//        HandlerMethod handlerMethod = (HandlerMethod) handler;
//        Method method = handlerMethod.getMethod();
//        Idempoent idempoent = method.getAnnotation(Idempoent.class);
//        if (idempoent != null) {
//            // 有注解，进行幂等性校验
//            checkToken(request);
//        }
//        return false;
//    }
//
//    private void checkToken(HttpServletRequest request) {
//        String token = request.getHeader("token");
//        if (StringUtils.isEmpty(token)) {
//            throw new RuntimeException("非法参数");
//        }
//        Boolean delete = stringRedisTemplate.delete(token);
//        if (!delete) {
//            // 重复请求
//            throw new RuntimeException("重复请求");
//        }
//    }
//}
