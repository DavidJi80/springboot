package net.tongark.springboot.webservice.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWebService {
    @WebMethod
    String sayHello(String name);
}
