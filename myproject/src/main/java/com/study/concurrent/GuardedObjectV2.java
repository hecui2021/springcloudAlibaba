package com.study.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author peterche
 * @description:
 * @date 2025-07-11
 */
public class GuardedObjectV2 {

    // 标识Guarded Object
    private int id;

    public GuardedObjectV2(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

class Mailboxes {
    private static Map<Integer, GuardedObjectV2> boxes = new ConcurrentHashMap<Integer, GuardedObjectV2>();

    private static int id = 1;

    private static synchronized int generateId() {
        return id++;
    }
    public static Set<Integer> getIds() {
        return boxes.keySet();
    }

    public static GuardedObjectV2 createGuardedObjectV2() {
        GuardedObjectV2 obj = new GuardedObjectV2(generateId());
        boxes.put(obj.getId(), obj);
        return obj;
    }

    public static GuardedObjectV2 get(int id) {
        // 删除一次性结果，防止boxes越来越大
        return boxes.remove(id);
    }

}

@Slf4j
class People extends Thread {
    @Override
    public void run() {
        GuardedObjectV2 guardedObjectV2 = Mailboxes.createGuardedObjectV2();
        log.info("收信 id：{}", guardedObjectV2.getId());
        Object mail = guardedObjectV2.get(5000);
        log.info("收到信id:{},内容：{}", guardedObjectV2.getId(), mail);
    }
}

@Slf4j
class Postman extends Thread {
    private int mailId;

    private Object mail;

    public Postman(int mailId, Object mail) {
        this.mailId = mailId;
        this.mail = mail;
    }

    @Override
    public void run() {
        GuardedObjectV2 guardedObjectV2 = Mailboxes.get(mailId);
        log.info("开始送信 id:{},内容：{}", mailId, mail);
        guardedObjectV2.complete(mail);
    }
}