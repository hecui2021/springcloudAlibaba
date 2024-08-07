package com.study.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author peterche
 * @description:
 * @date 2024-08-07
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add() {
        System.out.println("order");

        String forObject = restTemplate.getForObject("http://localhost:9000/stock/reduct", String.class);
        System.out.println(forObject);
        return "add order";
    }

}
