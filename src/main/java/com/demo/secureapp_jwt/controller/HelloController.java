package com.demo.secureapp_jwt.controller;

import org.springframework.web.bind.annotation.*;
@RestController
class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
