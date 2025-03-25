package com.example.spring3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("healthCheck")
public class HealthCheckController {

    @GetMapping("ok")
    Optional<String> healthCheckApi() {
        return Optional.of("OKAY");
    }
}
