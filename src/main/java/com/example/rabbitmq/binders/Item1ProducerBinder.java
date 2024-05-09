package com.example.rabbitmq.binders;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service("item1ProducerBinder")
public interface Item1ProducerBinder {

    @Output("item1OutPut")
    MessageChannel item1OutPut();

}
