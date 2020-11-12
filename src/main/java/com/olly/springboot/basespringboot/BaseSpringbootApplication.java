package com.olly.springboot.basespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.olly" })
@EntityScan("com.olly")
public class BaseSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseSpringbootApplication.class, args);
    }
    
}
