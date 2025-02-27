package com.springgreetingsapp.greetingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGreeting(@PathVariable Long id) {
        if (greetingService.deleteGreeting(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
