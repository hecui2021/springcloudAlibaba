package com.study.concurrent;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * @author peterche
 * @description: 同步模式之保护性暂停
 * @date 2025-07-11
 */
@Slf4j
public class GuardedObjectTest {
    public static void main(String[] args) {
        GuardedObject guardedObject = new GuardedObject();
        new Thread(() -> {
            log.info("等待结果");
            Object result = guardedObject.get(2000);
            log.info("result:{}", JSONObject.toJSONString(result));
        }, "t1").start();

        new Thread(() -> {
            log.info("开始处理并获取结果");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            guardedObject.complete("这是结果");
        }, "t2").start();
    }
}
