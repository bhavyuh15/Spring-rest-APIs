package com.springgreetingsapp.greetingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class GreetingServiceImpl {


    @Service
    public class GreetingService {
        @Autowired
        private GreetingRepository greetingRepository;

        public Optional<Greeting> updateGreeting(Long id, String newMessage) {
            Optional<Greeting> existingGreeting = greetingRepository.findById(id);
            if (existingGreeting.isPresent()) {
                Greeting greeting = existingGreeting.get();
                greeting.setMessage(newMessage);
                return Optional.of(greetingRepository.save(greeting));
            }
            return Optional.empty();
        }
    }
}