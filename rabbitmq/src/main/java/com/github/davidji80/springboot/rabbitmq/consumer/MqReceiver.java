package com.github.davidji80.springboot.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RabbitListener(queues = "queue-demo")
public class MqReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver:"+new Date()+" "+hello);
    }
}
