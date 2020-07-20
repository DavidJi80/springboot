package net.tongark.springboot.releasewebmvc.configurer;

import net.tongark.spring.webservice.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

import javax.annotation.Resource;

@Configuration
public class HessianServiceConfigurer {
    @Autowired
    private AccountService accountService;

    @Bean("/AccountService")
    public HessianServiceExporter exportHelloHessian()
    {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(accountService);
        exporter.setServiceInterface(net.tongark.spring.webservice.account.AccountService.class);
        return exporter;
    }
}
