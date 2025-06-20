package com.study.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author peterche
 * @description: spring生命周期测试
 * 自定义后置处理器
 * @date 2025-06-20
 */
@Component
public class MyBeanPostProcessor implements InstantiationAwareBeanPostProcessor, DestructionAwareBeanPostProcessor {
    private static final Logger log = LoggerFactory.getLogger(MyBeanPostProcessor.class);


    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if ("lifeCycleBean".equals(beanName)) {
            log.info("MyBeanPostProcessor 销毁之前执行");
        }
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("lifeCycleBean".equals(beanName)) {
            log.info("MyBeanPostProcessor 实例化之前执行，这里返回的对象会替换掉原来的bean");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("lifeCycleBean".equals(beanName)) {
            log.info("MyBeanPostProcessor 实例化之后执行，这里如果返回false,就会跳过依赖注入阶段");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if ("lifeCycleBean".equals(beanName)) {
            log.info("MyBeanPostProcessor 依赖注入阶段执行，如@Autowired、@Value、@Resource");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("lifeCycleBean".equals(beanName)) {
            log.info("MyBeanPostProcessor 初始化之前执行，这里返回的对象会替代原来的bean,如@PostConstruct、@ConfigurationProperties");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("lifeCycleBean".equals(beanName)) {
            log.info("MyBeanPostProcessor 初始化之后执行，这里返回的对象会替换到原来的bean，如代理增强");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
