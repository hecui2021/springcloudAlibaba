package com.study.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peterche
 * @description:
 * @date 2024-08-07
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduct")
    public String reduct() {
        System.out.println("reduct");
        return "stock";
    }
}
