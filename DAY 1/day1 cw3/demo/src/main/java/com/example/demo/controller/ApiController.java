package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ApiController {
    @GetMapping("/favouriteColor")
    public String requestMethodName( String color) {
        return "My favourite color is"+color+"!";
    }
   
    
}