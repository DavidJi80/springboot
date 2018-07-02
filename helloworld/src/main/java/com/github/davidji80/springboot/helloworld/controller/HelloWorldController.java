package com.github.davidji80.springboot.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${com.test.title}")
    private String title;
    @Value("${com.test.description}")
    private String description;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World!"+"title:"+title+",description:"+description;
    }
}
