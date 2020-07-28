package net.tongark.springboot.releasequartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ReleaseQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReleaseQuartzApplication.class, args);
    }

}
