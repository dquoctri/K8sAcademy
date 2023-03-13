package com.dln.k8sacademy.GradleApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValuesController {

    @GetMapping("/values")
    public Object getValues(){
        return "Hello World!";
    }
}
