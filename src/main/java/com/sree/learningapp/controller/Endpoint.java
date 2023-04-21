package com.sree.learningapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Endpoint {

    @GetMapping("/echo")
    public String echo(){

        return "Welcome!";
    }
}
