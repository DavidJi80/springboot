package net.tongark.springboot.releasequartz.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

@Component
public class RandomJob {

    @Scheduled(cron = "* * * * * ?")
    public void printRandomInt() {
        Random r = new Random();
        System.out.println(Thread.currentThread().getName() + " cron=* * * * * "+r.nextInt()+" --- " + new Date());
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
