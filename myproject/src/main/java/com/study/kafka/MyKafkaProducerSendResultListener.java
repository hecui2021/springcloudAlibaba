package com.study.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyKafkaProducerSendResultListener implements ProducerListener {

    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {
        log.info("send msg success:{}",producerRecord);
    }

//    @Override
//    public void onError(ProducerRecord producerRecord, Exception exception) {
//        log.error("send msg error:{}",exception.getMessage());
//    }

}
