package com.study.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class DemoSocketServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
        throws Exception {
        ByteBuf buf = (ByteBuf) msg;
        System.out.println("Client Address ====== " + ctx.channel().remoteAddress());
        ctx.channel().writeAndFlush("from server:" + UUID.randomUUID() + buf.toString(CharsetUtil.UTF_8));
        ctx.fireChannelActive();
        TimeUnit.MILLISECONDS.sleep(500);
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,
        Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}

