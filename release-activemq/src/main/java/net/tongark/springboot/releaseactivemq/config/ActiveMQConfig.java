package net.tongark.springboot.releaseactivemq.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveMQConfig {
    @Bean
    public Queue testQueue(){
        return new ActiveMQQueue("test");
    }

}
