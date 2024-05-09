package com.example.rabbitmq.producer.impl;

import com.example.rabbitmq.binders.Item1ProducerBinder;
import com.example.rabbitmq.producer.Item1Producer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("item1Producer")
@EnableBinding(Item1ProducerBinder.class)
public class Item1ProducerImpl implements Item1Producer {

    @Resource
    Item1ProducerBinder item1ProducerBinder;

    @Override
    public void sendMessage(Object message) {
        MessageBuilder messageBuilder = MessageBuilder.withPayload(message);
        item1ProducerBinder.item1OutPut().send(messageBuilder.build());
    }
}
