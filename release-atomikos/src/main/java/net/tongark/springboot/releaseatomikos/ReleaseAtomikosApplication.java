package net.tongark.springboot.releaseatomikos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ReleaseAtomikosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReleaseAtomikosApplication.class, args);
    }

}
