package com.example.Dhamal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DhamalController {

    @GetMapping("get")
    public String returnData(){
        return "Hello World";
    }
}