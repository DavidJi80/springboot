package net.tongark.springboot.releaseactivemq.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {
    @JmsListener(destination = "test")
    public void processMessage(String content) {
        System.out.println("Consumer:"+content);
    }
}
