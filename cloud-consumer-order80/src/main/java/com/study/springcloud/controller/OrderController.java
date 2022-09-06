package com.study.springcloud.controller;


import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/comsumer/payment")
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        String url = PAYMENT_URL + "/payment/getPaymentById?id=" + id;
        CommonResult commonResult = restTemplate.getForObject(url, CommonResult.class);
        log.info("getPaymentById success");
        return commonResult;
    }

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        String url = PAYMENT_URL + "/payment/insert";
        CommonResult commonResult = restTemplate.postForObject(url,payment, CommonResult.class);
        log.info("insert success");
        return commonResult;
    }

}
