package com.github.davidji80.springboot.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    StringRedisTemplate redis;

    @RequestMapping("/set/{name}")
    public String sendMsgToMq(@PathVariable String name) {
        redis.opsForValue().set("abc",name);
        return "success";
    }
}
