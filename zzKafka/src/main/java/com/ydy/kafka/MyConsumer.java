package com.ydy.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author: keluosi@bicitech.cn
 * @review:
 * @date: 2018/9/14
 */
@Component
public class MyConsumer {

    @KafkaListener(topics = "mytopic")
    public void listen(ConsumerRecord<?,String> record) {
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
    }
}