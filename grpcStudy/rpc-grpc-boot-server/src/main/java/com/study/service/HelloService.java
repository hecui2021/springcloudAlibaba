package com.study.service;

import com.study.HelloProto;
import com.study.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2024/9/24 22:56
 */
@GrpcService
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloRespone> responseObserver) {
        System.out.println("hello start");
    }
}
