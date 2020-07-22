package net.tongark.springboot.releasekafka.controllers;

import net.tongark.springboot.releasekafka.kafkaBeans.KafkaProducerBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

/*    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("send/{message}")
    public void send(@PathVariable String message) {
        this.kafkaTemplate.send("test", message);
    }*/

    @Autowired
    KafkaProducerBean kafkaProducerBean;

    @GetMapping("send/{topic}/{message}")
    public void send(@PathVariable String topic,@PathVariable String message) {
        kafkaProducerBean.send(topic,message);
    }

}