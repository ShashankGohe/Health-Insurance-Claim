package com.health.policy_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController
{

  @GetMapping("/hello")

    public  String  user ()
    {
        System.out.println("hello");
        return "name";
    }
    @PostMapping("/hello1")

    public  String  user1 ()
    {
        System.out.println("hello");
        return "name";
    }
}
