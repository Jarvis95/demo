package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GithubActionService {


    public String sayHello(){
        String s = sayHello2();
        return "Hello World :: "+ s;
    }

    private String sayHello2(){
        return "Github Action Service";
    }
}
