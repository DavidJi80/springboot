package net.tongark.springboot.releasekafka.kafkaBeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerBean {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "test")
    public void processMessage(String content) {
        logger.info("kafka message: " + content);
    }
}
