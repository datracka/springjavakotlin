package com.vicensfayos.springjavakotlin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
    @GetMapping("/hello2")
    public String hello() {
        return "Hello World 22!";
    }
}