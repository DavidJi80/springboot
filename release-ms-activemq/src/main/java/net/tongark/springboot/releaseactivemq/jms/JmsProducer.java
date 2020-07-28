package net.tongark.springboot.releaseactivemq.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class JmsProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    public void send(String message){
        jmsTemplate.convertAndSend(queue,message);
    }
}
