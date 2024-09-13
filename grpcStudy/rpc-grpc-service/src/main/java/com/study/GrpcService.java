package com.study;

import com.study.service.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2024/9/12 23:22
 */
public class GrpcService {

    public static void main(String[] args) throws Exception {
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(9000);
        serverBuilder.addService(new HelloServiceImpl());

        Server server = serverBuilder.build();
        server.start();
        server.awaitTermination();
    }
}
