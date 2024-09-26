package com.study.springcloud;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: peterche
 * @Description: 文件读写
 * @Date: 2024/9/25 23:40
 */
@Slf4j
public class TestByteBuffer {
    public static void main(String[] args) {
        try {
            FileChannel fileChannel = new FileInputStream("data.txt").getChannel();
            // 缓冲区
            ByteBuffer byteBuffer = ByteBuffer.allocate(5);
            while (true) {
                int read = fileChannel.read(byteBuffer);
                log.debug("读取到的字节:{}", read);
                if (read == -1) {
                    break;
                }
                // 切换读模式
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    log.debug("实际字节:{}", (char) byteBuffer.get());
                }
                // 切换写模式
                byteBuffer.clear();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
