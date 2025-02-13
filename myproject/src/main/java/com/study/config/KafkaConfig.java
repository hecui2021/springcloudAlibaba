package com.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;

/**
 * @author peterche
 * @description:
 * @date 2024-06-11
 */
@Configuration
public class KafkaConfig {

    @Autowired
    private ConsumerFactory<String, String> consumerFactory;

    @Bean("pingKafkaFactory")
    public ConcurrentKafkaListenerContainerFactory<String, String> delayContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> container = new ConcurrentKafkaListenerContainerFactory<String, String>();
        container.setConsumerFactory(consumerFactory);

        if (true) {
            // 禁止自动启动
            container.setAutoStartup(false);
        }
        return container;
    }
}
