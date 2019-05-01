package com.smartaddress.demo.web.handler;

import com.smartaddress.demo.dao.UserMapper;
import com.smartaddress.demo.vo.AuthTokenObject;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class AuthHandler {

    private final UserMapper userMapper;

    public AuthHandler(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Mono<AuthTokenObject> login(String username , String password){
         AuthTokenObject result = new AuthTokenObject("aaa" ,"bbb");
         return Mono.create(authMonoSink-> authMonoSink.success(result));
    }
}
