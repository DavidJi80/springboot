package com.github.davidji80.springboot.rabbitmq.controller;

import com.github.davidji80.springboot.rabbitmq.producer.MqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqController {


    @Autowired
    private MqSender mqSender;

    @RequestMapping("/send/{name}")
    public String sendMsgToMq(@PathVariable String name) {
        return mqSender.send(name);
    }
}
