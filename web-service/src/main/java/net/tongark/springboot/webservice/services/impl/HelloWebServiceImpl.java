package net.tongark.springboot.webservice.services.impl;

import net.tongark.springboot.webservice.services.HelloWebService;

import javax.jws.WebService;

@WebService
public class HelloWebServiceImpl implements HelloWebService {
    @Override
    public String sayHello(String name) {
        String said = name + ",Hello~~";
        System.out.println(said);
        return said;
    }

}
