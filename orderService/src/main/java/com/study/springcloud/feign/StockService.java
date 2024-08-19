package com.study.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stockService", path = "/stock", fallback = StockServiceFallback.class)
public interface StockService {

    @RequestMapping("/reduct")
    String reduct();
}
