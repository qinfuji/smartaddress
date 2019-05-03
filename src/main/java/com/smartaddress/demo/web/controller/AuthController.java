package com.smartaddress.demo.web.controller;


import com.smartaddress.demo.vo.AuthTokenObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {


    @GetMapping("/login")
    public Mono<AuthTokenObject> login(@RequestParam String username, @RequestParam String password) {
        return null;
    }

}
