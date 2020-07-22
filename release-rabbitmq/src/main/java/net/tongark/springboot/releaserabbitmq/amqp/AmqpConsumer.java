package net.tongark.springboot.releaserabbitmq.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class AmqpConsumer {
    @RabbitListener(queues = "789")
    public void processMessage(String content) {
        System.out.println("Consumer:"+content);
    }
}
