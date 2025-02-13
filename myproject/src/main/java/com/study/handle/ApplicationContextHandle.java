package com.study.handle;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author peterche
 * @description:
 * @date 2024-07-12
 */
@Configuration
public class ApplicationContextHandle implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextHandle.applicationContext = applicationContext;
    }

    public static Object getBean(String name) throws BeansException {
        return applicationContext.getBean(name);
    }

    public static Object getBean(Class aClass) throws BeansException {
        return applicationContext.getBean(aClass);
    }

}
