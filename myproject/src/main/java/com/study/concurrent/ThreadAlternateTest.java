package com.study.concurrent;

/**
 * @author peterche
 * @description: 线程交替执行
 * @date 2025-07-31
 */
public class ThreadAlternateTest {

    public static void main(String[] args) {
        WaitNotify waitNotify = new WaitNotify(1, 5);
        new Thread(() -> {
            waitNotify.print("a", 1, 2);
        }, "t1").start();

        new Thread(() -> {
            waitNotify.print("b", 2, 3);
        }, "t2").start();

        new Thread(() -> {
            waitNotify.print("c", 3, 1);
        }, "t3").start();
    }

    static class WaitNotify {
        public int flag;
        public int loopNum;

        public WaitNotify(int flag, int loopNum) {
            this.flag = flag;
            this.loopNum = loopNum;
        }

        public void print(String str, int waitFlag, int nextFlag) {
            for (int i = 0; i < loopNum; i++) {
                synchronized (this) {
                    while (flag != waitFlag) {
                        try {
                            this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(str);
                    flag = nextFlag;
                    this.notifyAll();
                }
            }
        }
    }
}
