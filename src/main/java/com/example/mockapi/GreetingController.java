package com.example.mockapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/ask")
    public Review ask(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Review("test");
    }

    @PostMapping("/ask")
    public Review ask(Query query) {
        return new Review("post response : " + query.getQuery());
    }
}