package com.smartaddress.demo.handler;

import com.smartaddress.demo.mapper.UserMapper;
import com.smartaddress.demo.vo.AuthResult;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class AuthHandler {

    private final UserMapper userMapper;

    public AuthHandler(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Mono<AuthResult> login(String username , String password){
         AuthResult result = new AuthResult("aaa" ,"bbb");
         return Mono.create(authMonoSink-> authMonoSink.success(result));
    }
}
