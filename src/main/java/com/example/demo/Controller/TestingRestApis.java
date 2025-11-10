package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingRestApis {

    @GetMapping("/testing")
    public String greet(){
        return "Hello world";
    }
}
