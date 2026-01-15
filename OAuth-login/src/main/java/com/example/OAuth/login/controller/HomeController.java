package com.example.OAuth.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String hello(){
        return "Hello, world";
    }

    @GetMapping("/secured")
    public String helloSecured(){
        return "Hello, secured";
    }
}
