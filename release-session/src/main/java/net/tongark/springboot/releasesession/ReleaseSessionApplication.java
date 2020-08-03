package net.tongark.springboot.releasesession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class ReleaseSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReleaseSessionApplication.class, args);
    }

}
