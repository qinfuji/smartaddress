package com.smartaddress.demo.controller;

import com.smartaddress.demo.handler.AuthHandler;
import com.smartaddress.demo.vo.AuthResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/auth")
public class AuthController {

    @Autowired
    private AuthHandler authHandler;

    @GetMapping("/login")
    public Mono<AuthResult> login(@RequestParam String username , @RequestParam String password){
        return authHandler.login(username , password);
    }

}
