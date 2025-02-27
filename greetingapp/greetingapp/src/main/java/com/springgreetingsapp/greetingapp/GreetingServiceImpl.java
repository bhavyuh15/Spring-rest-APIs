package com.springgreetingsapp.greetingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GreetingServiceImpl {
    @Autowired
    private GreetingRepository greetingRepository;

    public Optional<Greeting> findGreetingById(Long id) {
        return greetingRepository.findById(id);
    }
}
