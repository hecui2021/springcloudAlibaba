package com.study.springcloud.controller;

import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import com.study.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/insert")
    public CommonResult insert(@RequestBody Payment payment){
        int insert = paymentService.insert(payment);
        if(insert > 0){
            return new CommonResult<>(200,"插入成功");
        }
        return new CommonResult<>(500,"插入错误");
    }


    @GetMapping("/getPaymentById")
    public CommonResult getPaymentById(@RequestParam("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null){
            return new CommonResult<>(200,"查询成功",payment);
        }
        return new CommonResult<>(500,"查询失败");
    }
}
