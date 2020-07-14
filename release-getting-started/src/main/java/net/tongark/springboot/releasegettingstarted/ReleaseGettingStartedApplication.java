package net.tongark.springboot.releasegettingstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//表示这个类是Web Controller，来处理web请求
@RestController
//类级注释。让Spring Boot根据添加的依赖来“猜测”怎样配置Spring
@EnableAutoConfiguration
public class ReleaseGettingStartedApplication {

    //提供路由信息，告诉Spring将"/"映射到home方法上
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    //main方法，委托Spring Boot的SpringApplication类调用run方法来启动本Application
    public static void main(String[] args) {

        SpringApplication.run(ReleaseGettingStartedApplication.class, args);
    }

}
