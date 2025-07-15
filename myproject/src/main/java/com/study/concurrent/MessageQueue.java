package com.study.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

/**
 * @author peterche
 * @description: 异步模式之生产者/消费者
 * @date 2025-07-14
 */
@Slf4j
public class MessageQueue {

    // 消息的队列集合
    private LinkedList<Message> list = new LinkedList<>();
    // 队列容量
    private int capcity;

    public MessageQueue(int capcity) {
        this.capcity = capcity;
    }

    // 获取消息
    public Message take() {
        synchronized (list) {
            while (list.isEmpty()) {
                try {
                    log.info("队列为空，消费者线程等待");
                    list.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Message message = list.removeFirst();
            log.info("已消费消息：{}",message);
            // 通知生产者线程
            list.notifyAll();
            return message;
        }
    }

    // 存入消息
    public void put(Message message) {
        synchronized (list) {
            while (list.size() == capcity) {
                try {
                    log.info("队列已满，生产者线程等待");
                    list.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            // 将消息加入队列尾部
            list.addLast(message);
            log.info("已生产消息：{}", message);
            // 通知消费者线程
            list.notifyAll();
        }
    }

}

final class Message {
    private int id;

    private Object value;

    public int getId() {
        return id;
    }

    public Object getValue() {
        return value;
    }

    public Message(int id, Object value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}