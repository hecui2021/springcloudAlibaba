package com.study.redis;

import com.study.constant.Constant;

import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author peterche
 * @Description redisson延迟队列生产者
 * @Date 2023/2/24 17:10
 **/
@Service
@Slf4j
public class DelayQueueMessageProducer {

    @Autowired
    private RedissonDelayQueue redissonDelayQueue;

    /**
     * 发送消息到延迟队列
     * @param msg
     * @param delay
     * @param timeUnit
     */
    public void sendMsg(String msg, long delay, TimeUnit timeUnit) {
        String key = String.format(Constant.QUEUE_CODE, Constant.POI_QUERY_TOPIC);
        redissonDelayQueue.addDelayQueue(key,msg, delay, timeUnit);
        log.info("DelayQueueMessageProducer sendMsg：topic:{},msg:{},delay:{},timeUnit:{}", Constant.POI_QUERY_TOPIC, msg, delay, timeUnit);
    }
}
