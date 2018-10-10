package com.github.davidji80.springboot.rabbitmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MqSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send(String name){
        String context="hello " + name + " --"+new Date();
        System.out.println("Sender: "+context);
        this.rabbitTemplate.convertAndSend("queue-demo",context);
        return context;
    }


}
