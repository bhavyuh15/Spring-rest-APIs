package com.springgreetingsapp.greetingapp;

import java.util.List;
import java.util.Optional;

public interface GreetingService {
    String getGreeting(String firstName, String lastName);

    Greeting generateAndSaveGreeting(String firstName, String lastName);

    Optional<Greeting> findGreetingById(Long id);

    List<Greeting> getAllGreetings();
}
