package net.tongark.springboot.releaserabbitmq.amqp;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AmqpProducer {
    private final AmqpAdmin amqpAdmin;
    private final AmqpTemplate amqpTemplate;

    @Autowired
    public AmqpProducer(AmqpAdmin amqpAdmin, AmqpTemplate amqpTemplate) {
        this.amqpAdmin = amqpAdmin;
        this.amqpTemplate = amqpTemplate;
    }

    public String send(String queue,String name){
        String context="hello " + name + " --"+new Date();
        System.out.println("Sender: "+context);
        this.amqpTemplate.convertAndSend(queue,context);
        return context;
    }

    public String declareQueue(String name){
        Queue queue=new Queue(name);
        return amqpAdmin.declareQueue(queue);
    }
}
