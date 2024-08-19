package com.study.springcloud.feign;

import org.springframework.stereotype.Component;

/**
 * @author peterche
 * @description:
 * @date 2024-08-09
 */
@Component
public class   StockServiceFallback implements StockService {
    @Override
    public String reduct() {
        System.out.println("降级方法 reduct");
        return "error";
    }
}
