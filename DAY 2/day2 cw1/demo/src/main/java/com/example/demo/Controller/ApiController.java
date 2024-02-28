package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.AppConfig;
@RestController
public class ApiController {
    @Autowired
    private AppConfig ac;
    @GetMapping("/path")
    public AppConfig getAppDetails()
    {
        return ac;
    } 
    
}