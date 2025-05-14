package com.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.study.annotation.Idempoent;
import com.study.service.CountService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping
@Slf4j
public class CountController {

    @Autowired
    private CountService countService;

    @GetMapping("/hello")
    @Idempoent
    public String count() {
        return countService.count();
    }


    @GetMapping("/getRateLimiter")
    @Idempoent
    public String getRateLimiter() {
        return countService.getRateLimiter();
    }

    @PostMapping("/test")
    public String test(@RequestBody Map<String, String> map) {
        log.info("test start args:{}", JSONObject.toJSONString(map));
        Map<String, String> copyOfContextMap = MDC.getCopyOfContextMap();
        new Thread(() -> {
            try {
                MDC.setContextMap(copyOfContextMap);
                log.info("new thread test");
            } finally {
                MDC.clear();
            }
        }).start();;
        log.info("test end args:{}", JSONObject.toJSONString(map));
        return "success";
    }


}
