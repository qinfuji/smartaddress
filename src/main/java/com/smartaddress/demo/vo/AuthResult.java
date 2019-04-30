package com.smartaddress.demo.vo;

public class AuthResult {

    public String username;

    public String token;


    public AuthResult() {
    }

    public AuthResult(String username, String token) {
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
