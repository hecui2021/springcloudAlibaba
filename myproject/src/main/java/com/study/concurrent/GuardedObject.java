package com.study.concurrent;

/**
 * @author peterche
 * @description:
 * @date 2025-07-11
 */
public class GuardedObject {
    // 结果
    private Object response;

    // 获取结果
    // timeout表示要等待多件
    public Object get(long timeout) {
        synchronized (this) {
            // 没有结果
            long start = System.currentTimeMillis();
            long passed = 0;
            while (response == null) {
                long waitTime = timeout - passed;
                if (waitTime <= 0) {
                    break;
                }
                try {
                    this.wait(waitTime);// timeout - passed避免虚假唤醒
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                passed = System.currentTimeMillis() - start;
            }
            return response;
        }
    }

    public void complete(Object response) {
        synchronized (this) {
            // 给结果成员变量赋值
            this.response = response;
            this.notifyAll();
        }
    }
}
