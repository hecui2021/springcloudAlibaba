package com.study.netty.module.eventLoop;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;

import java.net.InetSocketAddress;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/2/10 20:41
 */
public class EventLoopClient {
    public static void main(String[] args) throws InterruptedException {
        // 1.客户端启动器
        Channel channel = new Bootstrap()
                // 2.BossEventLoop,workerEventLoop
                .group(new NioEventLoopGroup())
                // 3.选择服务器的ServerSocketChannel实现
                .channel(NioSocketChannel.class)
                // 4.boss负责处理连接事件 worker(child)负责处理读写事件
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        // 添加具体的handle
                        ch.pipeline().addLast(new StringEncoder());// 将字符串转为bytebuf（解码）
                    }
                })
                .connect(new InetSocketAddress("localhost", 8080))
                .sync()
                .channel();

        System.out.println(channel);
        System.out.println("");

    }
}
