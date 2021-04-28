package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * some thing
 */
@SpringBootApplication
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
        log.info("--------------------start--------");
        SpringApplication.run(DemoApplication.class, args);
    }

}
