package net.tongark.springboot.releasekafka.kafkaBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerBean {
    private final KafkaTemplate kafkaTemplate;

    @Autowired
    public KafkaProducerBean(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic,String message) {
        this.kafkaTemplate.send(topic, message);
    }
}
