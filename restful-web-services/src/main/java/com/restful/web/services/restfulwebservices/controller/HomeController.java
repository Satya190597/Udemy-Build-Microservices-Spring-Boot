package com.restful.web.services.restfulwebservices.controller;

import com.restful.web.services.restfulwebservices.dto.User;
import com.restful.web.services.restfulwebservices.dto.WelcomeMessage;
import com.restful.web.services.restfulwebservices.dto.WelcomeMessageDetail;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/message")
    public WelcomeMessage getStringMessage() {
        return WelcomeMessage.builder().message("Welcome To RestFul Web Services").user("Get User").build();
    }

    @PostMapping("/message")
    public WelcomeMessage postStringMessage() {
        return WelcomeMessage.builder().message("Welcome To RestFul Web Services").user("Post User").build();
    }

    // Accepting Path Variables.
    @GetMapping("/message/{id}")
    public WelcomeMessageDetail getMessageById(@PathVariable String id) {
        return WelcomeMessageDetail.builder().message("Welcome To RestFul Web Services").user(User.builder().id(id).build()).build();
    }

    // Accepting Multiple Path Variable.
    @GetMapping("/message/{id}/{name}")
    public WelcomeMessageDetail getMessageByIdAndUsername(@PathVariable String id, @PathVariable String name) {
        return WelcomeMessageDetail.builder().message("Welcome To RestFul Web Services").user(User.builder().id(id).name(name).build()).build();
    }

    // Path Variable With A Custom Name.
    @GetMapping("/message/username/{user_name}")
    public WelcomeMessageDetail getMessageByUsername(@PathVariable("user_name") String name) {
        return WelcomeMessageDetail.builder().message("Welcome To RestFul Web Services (Multiple Path Variable)").user(User.builder().name(name).build()).build();
    }

    // Request Params.
    @GetMapping("/params/message")
    public WelcomeMessageDetail getMessageByRequestParams(@RequestParam String name, @RequestParam String id) {
        return WelcomeMessageDetail.builder().message("Welcome To RestFul Web Services (Request Params)").user(User.builder().name(name).id(id).build()).build();
    }

    // Request Params With Custom Name.
    @GetMapping("/params/username/message")
    public WelcomeMessageDetail getMessageByUserNameParams(@RequestParam("user_name") String name) {
        return WelcomeMessageDetail.builder().message("Welcome To RestFul Web Services (Request Params And Custom Name)").user(User.builder().name(name).build()).build();
    }

    // Request Params With Optional Parameters.
    @GetMapping("/params/user/message")
    public WelcomeMessageDetail getMessageByUsernameOrId(@RequestParam(required = false,defaultValue = "Default User Name") String name, @RequestParam String id) {
        return WelcomeMessageDetail.builder().message("Welcome To RestFul Web Services (Optional Params)").user(User.builder().name(name).id(id).build()).build();
    }

}
