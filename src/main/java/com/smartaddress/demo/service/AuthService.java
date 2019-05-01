package com.smartaddress.demo.service;

import com.smartaddress.demo.vo.AuthTokenObject;

public interface AuthService {
    /**
     * 用户登录
     * @param name
     * @param password
     */
    AuthTokenObject login(String name , String password);
}
