package com.springgreetingsapp.greetingapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting() {
        String message = greetingService.getGreeting();
        return String.format("{\"message\": \"%s\"}", message);
    }

    @PostMapping
    public String createGreeting() {
        return "{\"message\": \"Hello, this is a POST request!\"}";
    }

    @PutMapping
    public String updateGreeting() {
        return "{\"message\": \"Hello, this is a PUT request!\"}";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "{\"message\": \"Hello, this is a DELETE request!\"}";
    }
}
