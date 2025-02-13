package com.study.config;//package com.study.config;
//
//import com.study.interceptor.IdempoentInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * @Author: peterche
// * @Description:
// * @Date: 2023/5/28 16:19
// */
//@Configuration
//public class InterceptorConfig extends WebMvcConfigurerAdapter {
//
//    @Bean
//    public IdempoentInterceptor idempoentInterceptor() {
//        return new IdempoentInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(idempoentInterceptor());
//        super.addInterceptors(registry);
//    }
//}
