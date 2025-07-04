package com.study.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author peterche
 * @description: 两阶段终止模式
 * @date 2025-07-02
 */
@Slf4j
public class TwoPhaseTermination {

    private Thread monitor;

    public static void main(String[] args) throws InterruptedException {
        TwoPhaseTermination twoPhaseTermination = new TwoPhaseTermination();
        twoPhaseTermination.start();
        TimeUnit.SECONDS.sleep(5);
        twoPhaseTermination.stop();

    }

    public void start() {
        monitor = new Thread(() -> {
            while (true) {
                Thread currentThread = Thread.currentThread();
                if (currentThread.isInterrupted()) {
                    // 当前线程被打断
                    log.info("monitor is interrupted");
                    break;
                }
                try {
                    TimeUnit.SECONDS.sleep(2);
                    log.info("执行监控记录");
                } catch (InterruptedException e) {
                    log.error("monitor is interrupted", e);
                    // 重新设置打断标记，因为sleep时被打断时会清除打断标记
                    currentThread.interrupt();
                }
            }
        });
        monitor.start();
    }

    public void stop() {
        monitor.interrupt();
    }
}
