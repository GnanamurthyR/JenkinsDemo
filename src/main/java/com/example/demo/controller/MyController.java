package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController()
@RequestMapping("/api/v1")
public class MyController {

    //Get
    @GetMapping("/aws")
    public String getString() {
        return "Yeah it's Working";
    }
}
