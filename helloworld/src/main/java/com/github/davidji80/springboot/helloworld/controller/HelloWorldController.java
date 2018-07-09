package com.github.davidji80.springboot.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private  final Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    @Value("${com.test.title}")
    private String title;
    @Value("${com.test.description}")
    private String description;

    @RequestMapping("/hello")
    public String index() {
        log.trace("TRACE");
        log.debug("DEBUG");
        log.info("INFO");
        log.warn("WARN");
        log.error("ERROR");

        return "Hello World!"+"title:"+title+",description:"+description;
    }
}
