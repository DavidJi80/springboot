package net.tongark.springboot.releasegettingstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReleaseGettingStartedApplication {

    //main方法，委托Spring Boot的SpringApplication类调用run方法来启动本Application
    public static void main(String[] args) {
        SpringApplication.run(ReleaseGettingStartedApplication.class, args);
    }

}
