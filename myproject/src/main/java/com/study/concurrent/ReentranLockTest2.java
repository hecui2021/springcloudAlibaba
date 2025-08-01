package com.study.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author peterche
 * @description:
 * @date 2025-07-31
 */
@Slf4j
public class ReentranLockTest2 {

    static ReentrantLock ROOM = new ReentrantLock();

    volatile static boolean hasCigarette = false;
    static boolean hasTakeout = false;
    // 等烟的休息室
    static Condition waitCigaretteSet = ROOM.newCondition();
    // 等外卖的休息室
    static Condition waitTakeoutSet = ROOM.newCondition();


    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            ROOM.lock();
            try {
                log.info("有烟没？[{}]", hasCigarette);
                while (!hasCigarette) {
                    log.info("没烟，先歇会！");
                    try {
                        waitCigaretteSet.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                log.info("有烟没？[{}]", hasCigarette);
                if (hasCigarette) {
                    log.info("可以开始干活了");
                } else {
                    log.info("没烟，无法干活");
                }
            } finally {
                ROOM.unlock();
            }
        }, "小南").start();

        new Thread(() -> {
            ROOM.lock();
            try {
                log.info("外卖到了没？[{}]", hasTakeout);
                while (!hasTakeout) {
                    log.info("外卖没到，先歇会！");
                    try {
                        waitTakeoutSet.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                log.info("外卖到了没？[{}]", hasTakeout);
                if (hasTakeout) {
                    log.info("可以开始吃饭了");
                } else {
                    log.info("外卖没到，无法吃饭");
                }
            } finally {
                ROOM.unlock();
            }
        }, "小女").start();

        Thread.sleep(1000);

        new Thread(() -> {
            ROOM.lock();
            try {
                hasTakeout = true;
                waitTakeoutSet.signal();
            } finally {
                ROOM.unlock();
            }
        }, "送外卖的").start();

        Thread.sleep(1000);

        new Thread(() -> {
            ROOM.lock();
            try {
                hasCigarette = true;
                waitCigaretteSet.signal();
            } finally {
                ROOM.unlock();
            }
        }, "送烟的").start();
    }
}
