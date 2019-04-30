package com.smartaddress.demo.controller;

import com.smartaddress.demo.handler.UserHandler;
import com.smartaddress.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserHandler userHandler;

    @PostMapping()
    public Mono<User> saveUser(@RequestBody User user){
        return userHandler.save(user);
    }
}
