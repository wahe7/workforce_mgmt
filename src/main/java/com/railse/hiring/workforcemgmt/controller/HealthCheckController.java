package com.railse.hiring.workforcemgmt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public String home() {
        return "✅ Workforce Mgmt API is running!";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
