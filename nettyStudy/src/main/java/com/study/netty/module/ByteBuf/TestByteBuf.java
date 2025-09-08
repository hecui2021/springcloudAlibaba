package com.study.netty.module.ByteBuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

/**
 * @author peterche
 * @description:
 * @date 2025-06-26
 */
public class TestByteBuf {
    public static void main(String[] args) {
        ByteBuf buf = ByteBufAllocator.DEFAULT.buffer(10);
        System.out.println(buf.getClass());
        System.out.println(buf);

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 300; i++) {
//            sb.append("a");
//        }
//        buf.writeBytes(sb.toString().getBytes());
//        System.out.println(buf);

        buf.writeBytes(new byte[]{1, 2, 3, 4});
        System.out.println(buf);
        buf.writeInt(5);
        System.out.println(buf);


    }
}
