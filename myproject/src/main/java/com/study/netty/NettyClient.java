package com.study.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.CharsetUtil;
import java.util.Date;

public class NettyClient {

    public static void main(String[] args) throws InterruptedException {
        clientStart();;
    }

    public static void clientStart() throws InterruptedException {
        NioEventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventLoopGroup)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline pipeline = ch.pipeline();
                        pipeline.addLast(new StringDecoder(CharsetUtil.UTF_8));
                        pipeline.addLast(new StringEncoder(CharsetUtil.UTF_8));
                        pipeline.addLast(new DemoSocketClientHandler());
                    }
                });

            ChannelFuture future = bootstrap.connect("localhost", 8888).sync();
            future.channel().closeFuture().sync();
        } finally {
            if(eventLoopGroup != null) {
                eventLoopGroup.shutdownGracefully();
            }
        }
    }


    public static void nettyClientTest() throws InterruptedException {
        //1.启动类
        new Bootstrap()
            //2.添加eventLoop
            .group(new NioEventLoopGroup())
            //3.选择客户端channel实现
            .channel(NioSocketChannel.class)
            //4.添加处理器
            .handler(new ChannelInitializer<Channel>() {
                @Override  //建立连接后被调用
                protected void initChannel(Channel ch) {
                    ch.pipeline().addLast(new StringEncoder());
                }
            })
            //连接服务器
            .connect("127.0.0.1", 8080)
            .sync()
            .channel()
            //向服务器发生数据
            .writeAndFlush(new Date() + ": hello world!");
    }

    public static void nettyClientTest2() throws InterruptedException {
        Channel channel = new Bootstrap()
            .group(new NioEventLoopGroup(1))
            .handler(new ChannelInitializer<NioSocketChannel>() {
                @Override
                protected void initChannel(NioSocketChannel ch) throws Exception {
                    System.out.println("init...");
                    ch.pipeline().addLast(new LoggingHandler(LogLevel.DEBUG));
                }
            })
            .channel(NioSocketChannel.class).connect("localhost", 8080)
            .sync()
            .channel();

        channel.writeAndFlush(ByteBufAllocator.DEFAULT.buffer().writeBytes("bbb".getBytes()));
        Thread.sleep(2000);
        channel.writeAndFlush(ByteBufAllocator.DEFAULT.buffer().writeBytes("bbb".getBytes()));
    }

}
