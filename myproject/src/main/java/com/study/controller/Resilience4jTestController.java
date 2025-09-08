package com.study.controller;

import com.study.pojo.Response;
import com.study.service.Resilience4jTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peterche
 * @description:
 * @date 2025-05-27
 */
@RestController
@RequestMapping("/resilience4jTest")
public class Resilience4jTestController {

    @Autowired
    private Resilience4jTestService resilience4jTestService;

    @RequestMapping("/retryTest")
    public Response<String> retryTest() {
        return resilience4jTestService.retryTest();
    }

    @RequestMapping("/circuitBreakerTest")
    public Response<String> circuitBreakerTest() {
        return resilience4jTestService.circuitBreakerTest();
    }

    @RequestMapping("/flowLimitTest")
    public Response<String> flowLimitTest() {
        return resilience4jTestService.flowLimitTest();
    }
}
