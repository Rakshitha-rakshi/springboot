package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class  ApiController {
    
    @RequestMapping("/studentName")
    public String studentName(@RequestParam String studentName) {
        return "Welcome "+ studentName +"!";
    }
    
}