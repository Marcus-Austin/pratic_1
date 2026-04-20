package com.study.pratic_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
}
