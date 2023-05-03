package com.example.quartzdemo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CronJob {

    @Scheduled(cron = "${cron-string}")
    public void everyFiveSeconds() {
        System.out.println("Periodic task: " + new Date());
    }

}