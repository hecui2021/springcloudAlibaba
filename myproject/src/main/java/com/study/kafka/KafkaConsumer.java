package com.study.kafka;

import com.study.constant.Constant;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = Constant.POI_QUERY_TOPIC,groupId = "default-group", containerFactory = "pingKafkaFactory")
    public void consume(ConsumerRecord<String,String> record, Acknowledgment ack) {
        String topic = record.topic();
        String key = record.key();
        String value = record.value();

        log.info("消费的消息 topic:{},key:{},value:{}",topic,key,value);

        ack.acknowledge();
    }
}
