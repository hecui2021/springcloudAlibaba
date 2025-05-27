package com.study.config;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.ratelimiter.RateLimiterConfig;
import io.github.resilience4j.ratelimiter.RateLimiterRegistry;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

/**
 * @author peterche
 * @description:
 * @date 2025-05-27
 */
@Configuration
public class Resilience4jConfig {

    /**
     * 重试配置
     * @return
     */
    @Bean
    public RetryConfig retryConfig() {
        return RetryConfig.custom()
                .maxAttempts(5)                       // 最大重试次数
                .waitDuration(Duration.ofMillis(1000)) // 重试间隔
                .failAfterMaxAttempts(true)           // 达到最大重试次数后抛出异常
                .build();
    }

    @Bean
    public RetryRegistry retryRegistry(RetryConfig retryConfig) {
        return RetryRegistry.of(retryConfig);
    }

    /**
     * 熔断配置
     * @return
     */
    @Bean
    public CircuitBreakerConfig normalCircuitBreaker() {
        return CircuitBreakerConfig.custom() //
                .slidingWindowType(CircuitBreakerConfig.SlidingWindowType.TIME_BASED) // 滑动窗口的类型为时间窗口
                .slidingWindowSize(10) // 时间窗口的大小为10秒
                .minimumNumberOfCalls(5) // 在单位时间窗口内最少需要5次调用才能开始进行统计计算
                .failureRateThreshold(50) // 在单位时间窗口内调用失败率达到50%后会启动断路器
                .slowCallRateThreshold(50) // 在单位时间窗口慢调用失败率达到50%后会启动断路器
                .slowCallDurationThreshold(Duration.ofSeconds(4))
                .enableAutomaticTransitionFromOpenToHalfOpen() // 允许断路器自动由打开状态转换为半开状态
                .permittedNumberOfCallsInHalfOpenState(10) // 在半开状态下允许进行正常调用的次数
                .waitDurationInOpenState(Duration.ofSeconds(10)) // 断路器打开状态转换为半开状态需要等待60秒
                .recordExceptions(Throwable.class) // 所有异常都当作失败来处理
                .build();
    }

    @Bean
    public CircuitBreakerRegistry circuitBreakerRegistry(CircuitBreakerConfig circuitBreakerConfig) {
        return CircuitBreakerRegistry.of(circuitBreakerConfig);
    }

    // 可选：创建指定名称的熔断器实例
    @Bean
    public CircuitBreaker userServiceCircuitBreaker(CircuitBreakerRegistry registry) {
        return registry.circuitBreaker("userService"); // 实例名称需与注解中的name匹配
    }

    /**
     * 限流配置
     * @return
     */
    @Bean
    public RateLimiterConfig rateLimiterConfig() {
        return RateLimiterConfig.custom()
                .limitForPeriod(2)                  // 每周期允许的请求数
                .limitRefreshPeriod(Duration.ofSeconds(5)) // 令牌刷新周期（1秒）
                .timeoutDuration(Duration.ofMillis(500))   // 获取令牌的最大等待时间
                .build();
    }

    @Bean
    public RateLimiterRegistry rateLimiterRegistry(RateLimiterConfig rateLimiterConfig) {
        return RateLimiterRegistry.of(rateLimiterConfig);
    }
}
