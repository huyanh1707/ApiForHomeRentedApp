package com.ju17th.firstapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class FirstApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstApiApplication.class, args);
    }

}
