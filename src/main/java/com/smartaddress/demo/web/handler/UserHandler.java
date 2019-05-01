package com.smartaddress.demo.web.handler;

import com.smartaddress.demo.dao.UserMapper;
import com.smartaddress.demo.po.User;
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
