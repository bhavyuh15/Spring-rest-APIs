package com.springgreetingsapp.greetingapp;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.*;

@Entity
public class Greeting {
@id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    public Greeting() {}

    public Greeting(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
