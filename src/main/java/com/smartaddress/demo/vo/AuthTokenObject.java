package com.smartaddress.demo.vo;

public class AuthTokenObject {

    public String username;

    public String token;


    public AuthTokenObject() {
    }

    public AuthTokenObject(String username, String token) {
        this.username = username;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
