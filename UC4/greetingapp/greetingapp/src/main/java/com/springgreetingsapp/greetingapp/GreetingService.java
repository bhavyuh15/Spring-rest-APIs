package com.springgreetingsapp.greetingapp;

public interface GreetingService {
    String getGreeting(String firstName, String lastName);

    Greeting generateAndSaveGreeting(String firstName, String lastName);
}
