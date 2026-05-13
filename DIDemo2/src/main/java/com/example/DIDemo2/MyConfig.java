package com.example.DIDemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Address address() {
        Address a = new Address();
        a.setCity("Lucknow");
        return a;
    }

    @Bean
    public Student student() {
        return new Student(12, "Smita", address());
    }
}