package com.study.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2023/10/7 23:22
 */
@Configuration
public class ThreadPoolConfig {

    // 获取服务器的cpu个数
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int COUR_SIZE = CPU_COUNT * 2;
    private static final int MAX_COUR_SIZE = CPU_COUNT * 4;

    @Bean
    @Qualifier("es-thread")
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(COUR_SIZE);
        threadPoolTaskExecutor.setMaxPoolSize(MAX_COUR_SIZE);
        threadPoolTaskExecutor.setQueueCapacity(MAX_COUR_SIZE * 4);
        threadPoolTaskExecutor.setThreadNamePrefix("es-thread");
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return threadPoolTaskExecutor;
    }

    @Bean
    @Qualifier("ias-thread")
    public ThreadPoolTaskExecutor iasThreadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(4);
        threadPoolTaskExecutor.setMaxPoolSize(8);
        threadPoolTaskExecutor.setQueueCapacity(200);
        threadPoolTaskExecutor.setThreadNamePrefix("ias-thread");
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return threadPoolTaskExecutor;
    }
}
