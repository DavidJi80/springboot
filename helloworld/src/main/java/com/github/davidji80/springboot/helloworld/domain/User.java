package com.github.davidji80.springboot.helloworld.domain;

import com.github.davidji80.springboot.helloworld.controller.HelloWorldController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private  final Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    String userName;
    String password;

    public void setUserName(String userName) {

        log.trace("TRACE");
        log.debug("DEBUG");
        log.info("INFO");
        log.warn("WARN");
        log.error("ERROR");
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
