package com.springgreetingsapp.greetingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GreetingServiceImpl {



    @Service
    public class GreetingService {
        @Autowired
        private GreetingRepository greetingRepository;

        public List<Greeting> getAllGreetings() {
            return greetingRepository.findAll();
        }
    }

}