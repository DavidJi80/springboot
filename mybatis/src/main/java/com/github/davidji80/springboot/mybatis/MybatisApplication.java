package com.github.davidji80.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//将项目中对应的mapper类的路径
@MapperScan("com.github.davidji80.springboot.mybatis.mapper")
//事务管理
@EnableTransactionManagement
//注解驱动的缓存管理功能
@EnableCaching
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}
