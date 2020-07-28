package net.tongark.springboot.releaseactivemq.controllers;

import net.tongark.springboot.releaseactivemq.jms.JmsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JmsController {
    @Autowired
    JmsProducer jmsProducer;

    @GetMapping("/send/{message}")
    public void send(@PathVariable String message){
        jmsProducer.send(message);
    }
}
