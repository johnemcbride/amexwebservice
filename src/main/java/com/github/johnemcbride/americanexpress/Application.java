package com.github.johnemcbride.americanexpress;

import java.lang.reflect.Field;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.*;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
    
    	
        SpringApplication.run(Application.class, args);
    }
}
