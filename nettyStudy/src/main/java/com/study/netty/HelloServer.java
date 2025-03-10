package com.study.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/2/7 23:15
 */
@Slf4j
public class HelloServer {
    public static void main(String[] args) {
        // 1.服务端启动器
        new ServerBootstrap()
                // 2.BossEventLoop,workerEventLoop
                .group(new NioEventLoopGroup())
                // 3.选择服务器的ServerSocketChannel实现
                .channel(NioServerSocketChannel.class)
                // 4.boss负责处理连接事件 worker(child)负责处理读写事件
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        // 添加具体的handle
                        ch.pipeline().addLast(new StringDecoder());// 将bytebuf转为字符串（解码）
                        // 自定义的handler
                        ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                            @Override
                            public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                log.info("channelRead msg:{}", msg);
                            }
                        });
                    }
                })
                .bind(8080);

    }
}
