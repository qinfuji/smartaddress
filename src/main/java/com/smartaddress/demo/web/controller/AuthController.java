package com.smartaddress.demo.web.controller;


import com.smartaddress.demo.service.AuthService;
import com.smartaddress.demo.service.UserService;
import com.smartaddress.demo.vo.AuthTokenObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/login")
    public Mono<AuthTokenObject> login( String username,  String password) {
         return null;
    }

}
