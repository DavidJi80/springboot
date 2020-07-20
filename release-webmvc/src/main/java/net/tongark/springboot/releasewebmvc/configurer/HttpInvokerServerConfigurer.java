package net.tongark.springboot.releasewebmvc.configurer;

import net.tongark.spring.webservice.account.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import javax.annotation.Resource;

@Configuration
public class HttpInvokerServerConfigurer {
    @Resource
    private AccountService accountService;

    @Bean(name = "/HttpInvokerAccountService")
    public HttpInvokerServiceExporter httpInvokerServiceExporter(){
        HttpInvokerServiceExporter serviceExporter=new HttpInvokerServiceExporter();
        serviceExporter.setService(accountService);
        serviceExporter.setServiceInterface(net.tongark.spring.webservice.account.AccountService.class);
        return serviceExporter;
    }
}
