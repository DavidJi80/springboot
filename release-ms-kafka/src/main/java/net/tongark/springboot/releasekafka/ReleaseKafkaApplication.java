package net.tongark.springboot.releasekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class ReleaseKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReleaseKafkaApplication.class, args);
    }

}
