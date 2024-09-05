package com.study.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2024/9/6 00:35
 */
@RestController
public class TestController {

    @RequestMapping("/add")
    public String add() {
        System.out.println("order");
        return "add order";
    }
}
