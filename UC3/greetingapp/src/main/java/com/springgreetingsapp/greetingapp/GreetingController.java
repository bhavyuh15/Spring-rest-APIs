package com.springgreetingsapp.greetingapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // GET request with optional query parameters
    @GetMapping
    public String getGreeting(@RequestParam(required = false) String firstName,
                              @RequestParam(required = false) String lastName) {
        String message = greetingService.getGreeting(firstName, lastName);
        return String.format("{\"message\": \"%s\"}", message);
    }
}

