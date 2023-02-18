package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to jenkins pipeline tutorial";
    }
}