package com.study.service.impl;

import com.study.pojo.Response;
import com.study.service.Resilience4jTestService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author peterche
 * @description:
 * @date 2025-05-27
 */
@Service
@Slf4j
public class Resilience4jTestServiceImpl implements Resilience4jTestService {

    @Override
    @Retry(name = "retryConfig", fallbackMethod = "fallback")
    public Response<String> retryTest() {
        log.info("retryTest start");
        String ret = new RestTemplate().getForObject("http://localhost:9090/retry", String.class);
        return new Response<>("success");
    }

    @Override
    @CircuitBreaker(name = "circuitBreakerConfig", fallbackMethod = "fallback")
    public Response<String> circuitBreakerTest() {
        return null;
    }

    @Override
    @RateLimiter(name = "rateLimiterConfig", fallbackMethod = "fallback")
    public Response<String> flowLimitTest() {
        log.info("flowLimitTest start");
        return null;
    }

    public Response<String> fallback(Throwable throwable) {
        log.info("fallback start", throwable);
        return new Response<>("fallback");
    }


}
