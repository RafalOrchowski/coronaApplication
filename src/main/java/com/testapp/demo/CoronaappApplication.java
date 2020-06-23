package com.testapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // so methods can be @scheduled
public class CoronaappApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronaappApplication.class, args);
    }

}
