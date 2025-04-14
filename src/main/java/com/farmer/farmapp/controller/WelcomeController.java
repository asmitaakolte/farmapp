package com.farmer.farmapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to the E-Learning Platform API!";
    }
}
