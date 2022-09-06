package com.study.springcloud.controller;

import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import com.study.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/insert")
    public CommonResult insert(@RequestBody Payment payment){
        int insert = paymentService.insert(payment);
        if(insert > 0){
            log.info("插入成功，port:{}",serverPort);
            return new CommonResult<>(200,"插入成功,serverPort:"+serverPort,insert);
        }
        return new CommonResult<>(500,"插入错误");
    }


    @GetMapping("/getPaymentById")
    public CommonResult getPaymentById(@RequestParam("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null){
            log.info("查询成功，port:{}",serverPort);
            return new CommonResult<>(200,"查询成功,serverPort:"+serverPort,payment);
        }
        return new CommonResult<>(500,"查询失败");
    }
}
