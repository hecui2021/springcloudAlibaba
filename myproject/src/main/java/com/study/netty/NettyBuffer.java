package com.study.netty;


import static io.netty.buffer.ByteBufUtil.appendPrettyHexDump;
import static io.netty.util.internal.StringUtil.NEWLINE;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NettyBuffer {
    public static void main(String[] args){
//        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer(10);  //默认容量是256，可以动态扩容
//        log(buffer);

        // 堆内存
//        ByteBuf buffer = ByteBufAllocator.DEFAULT.heapBuffer(10);

        // 直接内存
        ByteBuf buffer = ByteBufAllocator.DEFAULT.directBuffer(10);


    }

    private static void log(ByteBuf buffer) {
        int length = buffer.readableBytes();
        int rows = length / 16 + (length % 15 == 0 ? 0 : 1) + 4;
        StringBuilder buf = new StringBuilder(rows * 80 * 2)
            .append("read index:").append(buffer.readerIndex())
            .append(" write index:").append(buffer.writerIndex())
            .append(" capacity:").append(buffer.capacity())
            .append(NEWLINE);
        appendPrettyHexDump(buf, buffer);
        System.out.println(buf.toString());
    }

}
