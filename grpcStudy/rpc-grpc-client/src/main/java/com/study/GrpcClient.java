package com.study;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2024/9/12 23:36
 */
public class GrpcClient {
    public static void main(String[] args) {
        // 1.创建通信的管道channel
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 9000).usePlaintext().build();
        // 2.获取代理对象 stub
        HelloServiceGrpc.HelloServiceBlockingStub helloServiceStub = HelloServiceGrpc.newBlockingStub(managedChannel);
        // 3.完成rpc调用
        // 3.1准备参数
        HelloProto.HelloRequest.Builder builder = HelloProto.HelloRequest.newBuilder();
        builder.setName("peterche");
        HelloProto.HelloRequest helloRequest = builder.build();

        // 3.2rpc调用
        HelloProto.HelloRespone helloRespone = helloServiceStub.hello(helloRequest);
        String result = helloRespone.getResult();
        System.out.println("result:" + result);


    }

}
