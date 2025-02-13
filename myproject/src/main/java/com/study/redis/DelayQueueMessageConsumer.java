package com.study.redis;

import com.study.constant.Constant;
import com.study.kafka.KafkaProducer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author peterche
 * @Description redisson延迟队列消费者
 * @Date 2023/2/24 17:27
 **/
@Service
@Slf4j
public class DelayQueueMessageConsumer {

    @Autowired
    private RedissonDelayQueue redissonDelayQueue;
    @Autowired
    private KafkaProducer kafkaProducer;

    /**
     * redisson延迟队列消费端
     */
//    @PostConstruct
    public void consumerAndSendKafka() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            String key = String.format(Constant.QUEUE_CODE, Constant.POI_QUERY_TOPIC);
            while (true) {
                Object obj = redissonDelayQueue.getDelayQueue(key);
                if(obj != null){
                    try{
                        String msg = String.class.cast(obj);
                        kafkaProducer.sendMsg(Constant.POI_QUERY_TOPIC, msg);
                        log.info("DelayQueueMessageConsumer consume,topic:{}, msg：{}", Constant.POI_QUERY_TOPIC, msg);
                        Thread.sleep(10);
                    } catch (Exception e) {
                        log.info("DelayQueueMessageConsumer consume error ,topic:{}, e:{}", Constant.POI_QUERY_TOPIC, e);
                    }
                }
            }
        });
        log.info("(DelayQueueMessageConsumer start success)");
    }
}
