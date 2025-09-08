package com.study.service;

import com.study.pojo.Response;

/**
 * @author peterche
 * @description:
 * @date 2025-05-27
 */
public interface Resilience4jTestService {

    Response<String> retryTest();

    Response<String> circuitBreakerTest();

    Response<String> flowLimitTest();
}
