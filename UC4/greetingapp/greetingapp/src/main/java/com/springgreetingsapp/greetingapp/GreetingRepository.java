package com.springgreetingsapp.greetingapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    Greeting save(Greeting greeting);
}
