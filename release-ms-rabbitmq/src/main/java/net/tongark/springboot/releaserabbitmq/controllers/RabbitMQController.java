package net.tongark.springboot.releaserabbitmq.controllers;

import net.tongark.springboot.releaserabbitmq.amqp.AmqpProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQController {
    @Autowired
    AmqpProducer amqpProducer;

    @GetMapping("/addQueue/{name}")
    public String addQueue(@PathVariable String name){
        return amqpProducer.declareQueue(name);
    }

    @GetMapping("/send/{queue}/{name}")
    public void sendMessage(@PathVariable String queue,@PathVariable String name){
        amqpProducer.send(queue,name);
    }
}
