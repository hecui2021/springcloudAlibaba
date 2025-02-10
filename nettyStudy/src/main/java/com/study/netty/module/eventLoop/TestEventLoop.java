package com.study.netty.module.eventLoop;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/2/9 23:54
 */
@Slf4j
public class TestEventLoop {
    public static void main(String[] args) {
        // 创建事件循环组
        EventLoopGroup group = new NioEventLoopGroup(2);// io事件/普通任务/定时任务
//        EventLoopGroup group = new DefaultEventLoopGroup();// 普通任务/定时任务

        System.out.println(group.next());
        System.out.println(group.next());
        System.out.println(group.next());

        // 普通任务
//        group.next().execute(() -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            log.info("thread execute");
//        });

        // 定时任务
        group.next().scheduleAtFixedRate(() -> {
            log.info("thread execute2");
        }, 3, 1, TimeUnit.SECONDS);

        log.info("main");
    }
}
