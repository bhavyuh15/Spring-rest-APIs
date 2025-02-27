package com.springgreetingsapp.greetingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl {


    @Service
    public class GreetingService {
        @Autowired
        private GreetingRepository greetingRepository;

        public boolean deleteGreeting(Long id) {
            if (greetingRepository.existsById(id)) {
                greetingRepository.deleteById(id);
                return true;
            }
            return false;
        }
    }

}