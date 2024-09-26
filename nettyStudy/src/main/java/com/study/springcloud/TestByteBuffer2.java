package com.study.springcloud;

import java.nio.ByteBuffer;

/**
 * @Author: peterche
 * @Description: 黏包半包
 * @Date: 2024/9/26 23:17
 */
public class TestByteBuffer2 {
    public static void main(String[] args) {
        ByteBuffer source = ByteBuffer.allocate(32);
        source.put("hello,world\nI am zhangsan\nHo".getBytes());
        split(source);
        source.put("w are you".getBytes());
        split(source);
    }

    private static void split(ByteBuffer source) {
        source.flip();
        for (int i = 0; i < source.limit(); i++) {
            // 找到一条完整消息
            if (source.get(i) == '\n') {
                // 存入新的ByteBuffer
                int length = i + 1 - source.position();
                ByteBuffer target = ByteBuffer.allocate(length);
                // 从source读，写入到target
                for (int j = 0; j < length; j++) {
                    target.put(source.get());
                }
                System.out.println(new String(target.array()));
            }
        }
        source.compact();
    }
}
