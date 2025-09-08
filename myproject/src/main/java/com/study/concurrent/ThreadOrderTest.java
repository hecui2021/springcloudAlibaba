package com.study.concurrent;

import lombok.extern.slf4j.Slf4j;

/**
 * @author peterche
 * @description: 同步模式之顺序控制
 * @date 2025-07-31
 */
@Slf4j
public class ThreadOrderTest {
    static Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            log.info("1");
            synchronized (lock) {
                lock.notifyAll();
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            log.info("2");
        }, "t2");

        t2.start();

        Thread.sleep(1000);

        t1.start();
    }
}
