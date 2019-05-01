package com.smartaddress.demo.web.controller;

import com.smartaddress.demo.po.User;
import com.smartaddress.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public Mono<User> saveUser(@RequestBody User user){
        return Mono.create(userMonoSink -> userMonoSink.success(userService.save(user)));
    }

    @PutMapping("/{id}")
    public Mono<User> update(@RequestParam String id ,  @RequestBody User user){
        return Mono.create(userMonoSink -> userMonoSink.success(userService.update(id , user)));
    }

    @GetMapping("/{id}")
    public Mono<User> findById(@RequestParam String id){
        return Mono.create(userMonoSink -> userMonoSink.success(userService.findUserById(id)));
    }
}
