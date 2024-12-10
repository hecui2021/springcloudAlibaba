package com.study.nio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2024/9/28 23:20
 */
@Slf4j
public class BlockClient {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 8080));

        // 接收数据
        int count = 0;
        while (true) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024 * 1024);
            count += socketChannel.read(byteBuffer);
            System.out.println(count);
            byteBuffer.clear();
        }

//        socketChannel.write(Charset.defaultCharset().encode("hello\nworld\n"));
//        log.debug("waiting...");
//        System.in.read();
    }
}
