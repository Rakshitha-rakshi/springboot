package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;

@RestController
public class AddressController {
    @RequestMapping("/address")
    public Address getAddress()
    {
        Address a=new Address("nidharshan",123,"Main St",658865,"pudur","salem","tamil nadu","india");
        return a;
    }
}