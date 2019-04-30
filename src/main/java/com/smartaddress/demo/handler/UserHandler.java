package com.smartaddress.demo.handler;

import com.smartaddress.demo.mapper.UserMapper;
import com.smartaddress.demo.model.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class UserHandler {

    private final UserMapper userMapper;

    public UserHandler(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public Mono<User> save(User  user){
        return Mono.create(userMonoSink -> userMonoSink.success(new User()));
    }
}
