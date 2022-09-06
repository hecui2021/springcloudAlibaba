package com.study.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/payment/zk")
    public String paymentzk(){
        String result = restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
        log.info("getPaymentById success");
        return result;
    }

}
