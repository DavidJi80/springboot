package com.github.davidji80.springboot.mahout;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.davidji80.springboot.mahout.mapper")
public class MahoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(MahoutApplication.class, args);
    }
}
