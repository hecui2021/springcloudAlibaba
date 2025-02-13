package com.study.netty;

import io.netty.channel.DefaultEventLoop;
import io.netty.util.concurrent.DefaultPromise;
import java.util.concurrent.ExecutionException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NettyPromise {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        syncPromiseTest2();
    }

    public static void syncPromiseTest() throws ExecutionException, InterruptedException {
        DefaultEventLoop eventExecutors = new DefaultEventLoop();
        DefaultPromise<Object> promise = new DefaultPromise<>(eventExecutors);

        eventExecutors.execute(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("set success ,{}",10);
            promise.setSuccess(20);
        });

        log.info("start....");
        log.info("getNow:{}",promise.getNow());
        log.info("get:{}",promise.get());
    }

    public static void asyncPromiseTest() {
        DefaultEventLoop eventExecutors = new DefaultEventLoop();
        DefaultPromise<Object> promise = new DefaultPromise<>(eventExecutors);

        promise.addListener(future -> {
            log.info("get now:{}",future.getNow());
        });

        eventExecutors.execute(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("set success ,{}",10);
            promise.setSuccess(20);
        });

        log.info("start....");
    }

    public static void syncPromiseTest2() throws ExecutionException, InterruptedException {
        DefaultEventLoop eventExecutors = new DefaultEventLoop();
        DefaultPromise<Object> promise = new DefaultPromise<>(eventExecutors);

        eventExecutors.execute(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            RuntimeException e = new RuntimeException("error...");
            log.debug("set failure, {}", e.toString());
            //告诉promise获取结果出现失败了
            promise.setFailure(e);
        });

        log.info("start....");
        log.info("getNow:{}",promise.getNow());
        log.info("get:{}",promise.get());
    }



}
