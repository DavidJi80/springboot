package com.github.davidji80.springboot.helloworld.controller;

import com.github.davidji80.springboot.helloworld.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJsonController {

    @RequestMapping("/getUser")
    public User getUser() {

        User user=new User();
        user.setUserName("小明");
        user.setPassword("xxxx");
        return user;
    }
}