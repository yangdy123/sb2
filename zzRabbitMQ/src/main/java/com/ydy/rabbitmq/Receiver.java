package com.ydy.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
@Slf4j
public class Receiver {

    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void receiverDirectQueue(String userStr) {
    	User user = new Gson().fromJson(userStr, User.class);
    	System.out.println("user 0:");
    	System.out.println(user.userId);
    	System.out.println(user.name);
//        log.info("【receiverDirectQueue监听到消息】" + user.toString());
    }

    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitMQConfig.TOPIC_QUEUE1)
    public void receiveTopic1(String userStr) {
    	User user = new Gson().fromJson(userStr, User.class);
    	System.out.println("user 1:");
    	System.out.println(user.userId);
    	System.out.println(user.name);
//        log.info("【receiveTopic1监听到消息】" + user.toString());
    }
    @RabbitListener(queues = RabbitMQConfig.TOPIC_QUEUE2)
    public void receiveTopic2(String userStr) {
    	User user = new Gson().fromJson(userStr, User.class);
    	System.out.println("user 2:");
    	System.out.println(user.userId);
    	System.out.println(user.name);
//        log.info("【receiveTopic2监听到消息】" + user.toString());
    }
}
