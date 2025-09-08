package com.study.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author peterche
 * @description:
 * @date 2025-07-30
 */
@Slf4j
public class ReentranLockTest {
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                log.info("尝试获取锁");
                lock.lockInterruptibly();
            } catch (InterruptedException e) {
                e.printStackTrace();
                log.info("获取锁失败");
                return;
            }

            try {
                log.info("获取到锁");
            } finally {
                lock.unlock();
            }
        }, "t1");

        lock.lock();
        t1.start();

        Thread.sleep(1000);

        log.info("打断t1");
        t1.interrupt();
    }
}
