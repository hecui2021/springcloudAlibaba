package com.study.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NettyServer {

    public static void main(String[] args) throws InterruptedException {
        serverStart();
    }

    public static void serverStart() throws InterruptedException {
        EventLoopGroup parentGroup = new NioEventLoopGroup();
        EventLoopGroup childGroup = new NioEventLoopGroup();
        try {

            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(parentGroup, childGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 1024)
                .childHandler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {

                        ChannelPipeline pipeline = ch.pipeline();

                        pipeline.addLast(new StringEncoder());
                        pipeline.addLast(new DemoSocketServerHandler());
                    }
                });

            ChannelFuture future = bootstrap.bind(8888).sync();
            System.out.println("服务器已启动。。。");

            future.channel().closeFuture().sync();
        } finally {
            parentGroup.shutdownGracefully();
            childGroup.shutdownGracefully();
        }
    }

    public static void nettyServerTest(){
        //1.启动器，负责组转netty组件，启动服务器
        new ServerBootstrap()
            // 2.加入nio组的监听器（在里面包含selector选择器）
            .group(new NioEventLoopGroup())
            // 3.选择服务器的ServerSocketChannel实现
            .channel(NioServerSocketChannel.class)
            //4.boss负责处理连接   worker(child)负责处理读写，决定了worker(child)能执行哪些操作(handler)
            .childHandler(
                //5.channel代表和客户端进行数据读写通道initializer初始化，负责添加其他的handler
                new ChannelInitializer<NioSocketChannel>() {
                    //该方法是连接建立后才执行
                    protected void initChannel(NioSocketChannel ch) {
                        //6.添加具体的handler
                        ch.pipeline().addLast(new StringDecoder()); //将ByteBuf转换为字符串
                        ch.pipeline().addLast(new SimpleChannelInboundHandler<String>() {  //自定义handler
                            @Override  //读事件
                            protected void channelRead0(ChannelHandlerContext ctx, String msg) {
                                //打印上一步转换好的字符串
                                System.out.println(msg);
                            }
                        });
                    }
                })
            //7.绑定监听器端口
            .bind(8080);
    }

    public static void nettyServerTest2() throws InterruptedException {
        new ServerBootstrap()
            //更加细化的进行分工，一个是专门用来处理accept请求的，另外的是用来处理read和write的
            .group(new NioEventLoopGroup(1), new NioEventLoopGroup(2))
            .channel(NioServerSocketChannel.class)
            .childHandler(new ChannelInitializer<NioSocketChannel>() {
                @Override
                protected void initChannel(NioSocketChannel ch) {
                    ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                        //这里监听的方法是根据我们自己的需求来的
                        @Override							//因为没有进行转换字符集，msg是ByteBuf类型
                        public void channelRead(ChannelHandlerContext ctx, Object msg) {
                            ByteBuf byteBuf = msg instanceof ByteBuf ? ((ByteBuf) msg) : null;
                            if (byteBuf != null) {
                                byte[] buf = new byte[16];
                                ByteBuf len = byteBuf.readBytes(buf, 0, byteBuf.readableBytes());
                                log.debug(new String(buf));
                            }
                        }
                    });
                }
            }).bind(8080).sync();
    }

}
