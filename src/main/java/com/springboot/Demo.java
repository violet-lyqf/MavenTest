package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Demo {
    public static void main(String[] args){
        /*System.out.println("Hello word!");*/
        SpringApplication.run(Demo.class,args);
    }
}
