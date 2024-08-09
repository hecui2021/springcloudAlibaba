package com.study.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "stockService", fallback = StockServiceFallback.class)
public interface StockService {

    @RequestMapping("/stock/reduct")
    String reduct();
}
