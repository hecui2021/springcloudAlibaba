package com.study.service;

import com.study.HelloProto;
import com.study.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2024/9/12 22:07
 */
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloRespone> responseObserver) {
        // 1.接收client参数
        String name = request.getName();

        // 2.业务处理
        System.out.println("name:" + name);

        // 3.封装响应
        // 3.1 创建响应对象的构建者
        HelloProto.HelloRespone.Builder builder = HelloProto.HelloRespone.newBuilder();
        // 3.2填充数据
        builder.setResult("hello method invoke");
        // 3.3封装响应
        HelloProto.HelloRespone helloRespone = builder.build();

        responseObserver.onNext(helloRespone);
        responseObserver.onCompleted();
    }

    @Override
    public void serverHello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloRespone> responseObserver) {
        // 1.接收client参数
        String name = request.getName();

        // 2.业务处理
        System.out.println("name:" + name);

        for (int i = 0 ; i < 10 ; i++) {
            // 3.封装响应
            // 3.1 创建响应对象的构建者
            HelloProto.HelloRespone.Builder builder = HelloProto.HelloRespone.newBuilder();
            // 3.2填充数据
            builder.setResult("serverHello method invoke");
            // 3.3封装响应
            HelloProto.HelloRespone helloRespone = builder.build();

            responseObserver.onNext(helloRespone);
            try {
                Thread.sleep(1000 );
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onCompleted();
    }
}
