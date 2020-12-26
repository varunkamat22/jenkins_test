package com.example.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/home")
public class WelcomeController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "hello, " + name;
    }

}