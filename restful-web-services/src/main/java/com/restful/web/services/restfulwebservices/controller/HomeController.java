package com.restful.web.services.restfulwebservices.controller;

import com.restful.web.services.restfulwebservices.dto.WelcomeMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/message")
    public WelcomeMessage getStringMessage() {
        return WelcomeMessage.builder().message("Welcome To RestFul Web Services").user("Home User").build();
    }
}
