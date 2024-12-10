package com.study.nio;

import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.Iterator;

/**
 * @Author: peterche
 * @Description:多路复用
 * @Date: 2024/9/28 23:12
 */
@Slf4j
public class BlockServer {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 设置非阻塞
        serverSocketChannel.configureBlocking(false);

        // 1.创建selector,管理多个channel
        Selector selector = Selector.open();

        // 2.建立selector与channel的联系（注册）
        SelectionKey serverSelectionKey = serverSocketChannel.register(selector, 0, null);
        // 指定key只关注accept事件
        serverSelectionKey.interestOps(SelectionKey.OP_ACCEPT);
        log.debug("serverSelectionKey:{}", serverSelectionKey);

        // 绑定监听端口
        serverSocketChannel.bind(new InetSocketAddress(8080));

        while (true) {
            // 3.select方法,没有事件就阻塞,事件未处理时，不会阻塞
            selector.select();
            // 4.处理事件
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();

            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                log.debug("selectionKey:{}", selectionKey);

                // 重点，处理后需要移除掉
                iterator.remove();

                // 区分事件类型
                if (selectionKey.isAcceptable()) {
                    ServerSocketChannel channel = (ServerSocketChannel) selectionKey.channel();
                    SocketChannel socketChannel = channel.accept();
                    socketChannel.configureBlocking(false);

                    ByteBuffer buffer = ByteBuffer.allocate(4);//attachment
                    // 将一个ByteBuffer作为一个附件关联到selectionkey
                    SelectionKey socketChannelKey = socketChannel.register(selector, 0, buffer);
                    socketChannelKey.interestOps(SelectionKey.OP_READ);
                    log.debug("socketChannelKey:{}", socketChannelKey);

                    // 向客户端发送大量数据
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0;i < 3000000;i++) {
                        sb.append("a");
                    }
                    ByteBuffer byteBuffer = Charset.defaultCharset().encode(sb.toString());

                    while (byteBuffer.hasRemaining()) {
                        int write = socketChannel.write(byteBuffer);
                        log.debug("write:{}", write);
//                        socketChannelKey.interestOps(socketChannelKey.interestOps() | SelectionKey.OP_WRITE);
                    }

                } else if (selectionKey.isReadable()) {
                    SocketChannel channel = (SocketChannel) selectionKey.channel();
                    ByteBuffer buffer = (ByteBuffer) selectionKey.attachment();
                    int read = channel.read(buffer);// 阻塞方法
                    if (read > 0) {
//                        buffer.flip();
//                        log.debug(Charset.defaultCharset().decode(buffer).toString());
//                        buffer.clear();
                        split(buffer);
                        if (buffer.position() == buffer.limit()) {
                            ByteBuffer newBuffer = ByteBuffer.allocate(buffer.capacity() * 2);
                            buffer.flip();
                            newBuffer.put(buffer);
                            selectionKey.attach(newBuffer);
                        }
                        log.debug("after read...{}", channel);
                    } else if (read == -1) {
                        // 客户端断开连接会有读事件
                        selectionKey.cancel();
                    }
                }
            }
        }
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
