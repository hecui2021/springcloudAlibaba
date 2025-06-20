package com.study.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author peterche
 * @description: spring生命周期测试
 * 执行顺序；构造方法 -> 依赖注入 -> 初始化 -> 销毁
 * @date 2025-06-20
 */
@Component
public class LifeCycleBean {

    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

    public LifeCycleBean() {
        log.info("构造");
    }

    @Autowired
    public void autowire(@Value("${JAVA_HOME:cevcre}") String home) {
        log.info("依赖注入:{}", home);
    }

    @PostConstruct
    public void init() {
        log.info("初始化");
    }

    @PreDestroy
    public void destroy() {
        log.info("销毁");
    }


}
