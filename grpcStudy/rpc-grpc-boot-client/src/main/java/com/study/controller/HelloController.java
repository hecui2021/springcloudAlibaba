package com.study.controller;

import com.study.HelloProto;
import com.study.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2024/9/24 23:34
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GrpcClient("grpc-server")
    private HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub;

    @RequestMapping("/test1")
    public String test1(@RequestParam String name) {
        System.out.println(name);
        HelloProto.HelloRespone helloRespone = helloServiceBlockingStub.hello(HelloProto.HelloRequest.newBuilder().setName(name).build());
        System.out.println(helloRespone);
        return helloRespone.getResult();
    }

}
