package com.onapp.hellospringmaven.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(String name) {
        return "Hi, I'm " + name;
    }
}
