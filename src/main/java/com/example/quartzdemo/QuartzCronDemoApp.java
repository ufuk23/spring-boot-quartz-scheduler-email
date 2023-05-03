package com.example.quartzdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QuartzCronDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(QuartzCronDemoApp.class, args);
    }

}