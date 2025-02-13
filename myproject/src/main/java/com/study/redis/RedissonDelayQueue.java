package com.study.redis;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBlockingDeque;
import org.redisson.api.RDelayedQueue;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author peterche
 * @Description redisson延迟队列
 * @Date 2023/2/24 17:06
 **/
@Slf4j
@Service
public class RedissonDelayQueue {

//    @Autowired
    private RedissonClient redissonClient;

    /**
     * 添加延迟队列
     * @param key       队列键
     * @param value     队列值
     * @param delay     延迟时间
     * @param timeUnit  时间单位
     * @param <T>
     */
    public <T> void addDelayQueue(String key, T value, long delay, TimeUnit timeUnit) {
        try {
            RBlockingDeque<Object> blockingDeque = redissonClient.getBlockingDeque(key);
            RDelayedQueue<Object> delayedQueue = redissonClient.getDelayedQueue(blockingDeque);
            delayedQueue.offer(value, delay, timeUnit);
            log.info("addDelayQueue success key：{}，value：{}，time：{}", key, value, timeUnit.toSeconds(delay) + "s");
        } catch (Exception e) {
            log.error("addDelayQueue key:{},error {}",key, e.getMessage());
            throw new RuntimeException("(addDelayQueue error)");
        }
    }

    /**
     * 获取延迟队列
     * @param key
     * @param <T>
     * @return
     * @throws InterruptedException
     */
    public <T> T getDelayQueue(String key) {
        RBlockingDeque<Map> blockingDeque = redissonClient.getBlockingDeque(key);
        T value;
        try {
            value = (T) blockingDeque.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

}
