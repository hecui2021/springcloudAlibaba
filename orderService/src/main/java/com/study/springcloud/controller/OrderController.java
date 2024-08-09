package com.study.springcloud.controller;

import com.study.springcloud.feign.StockService;
//import io.seata.spring.annotation.GlobalTransactional;
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

    @Autowired
    private StockService stockService;

    /**
     * @GlobalTransactional 分布式事务
     * @return
     */
    @RequestMapping("/add")
//    @GlobalTransactional
    public String add() {
        System.out.println("order");

//        String forObject = restTemplate.getForObject("http://stockService/stock/reduct", String.class);
        stockService.reduct();
        return "add order";
    }

}
