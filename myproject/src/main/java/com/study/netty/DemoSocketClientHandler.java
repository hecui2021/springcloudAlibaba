package com.study.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

import java.util.concurrent.TimeUnit;

public class DemoSocketClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
        throws Exception {
        System.out.println(msg);
        ctx.channel().writeAndFlush("from client: " + System.currentTimeMillis());
        TimeUnit.MILLISECONDS.sleep(5000);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx)
        throws Exception {
        ByteBuf buf= Unpooled.copiedBuffer("begin talking".getBytes(CharsetUtil.UTF_8));
        ctx.channel().writeAndFlush(buf);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,
        Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}

