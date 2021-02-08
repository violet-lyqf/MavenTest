package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloClass {

    @GetMapping("/hello")
    public String hello(){
        return "Welocome to Springboot";
    }
}
