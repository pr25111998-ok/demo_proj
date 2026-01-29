package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Java App running on AKS!";
    }

    @GetMapping("/status")
    public String status() {
        return "Java App is Running Successfully!";
    }
}
