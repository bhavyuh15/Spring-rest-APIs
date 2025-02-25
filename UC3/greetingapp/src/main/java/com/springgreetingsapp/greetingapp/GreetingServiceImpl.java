package com.springgreetingsapp.greetingapp;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return String.format("Hello %s %s!", firstName, lastName);
        } else if (firstName != null) {
            return String.format("Hello %s!", firstName);
        } else if (lastName != null) {
            return String.format("Hello Mr./Ms. %s!", lastName);
        } else {
            return "Hello World!";
        }
    }
}
