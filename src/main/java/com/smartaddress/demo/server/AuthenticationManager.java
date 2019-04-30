package com.smartaddress.demo.server;

import com.smartaddress.demo.utils.JwtHelper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;

import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AuthenticationManager implements ReactiveAuthenticationManager {

    @Override
    public Mono<Authentication> authenticate(Authentication authentication) {
        String authToekn=authentication.getCredentials().toString();
        try {
            Claims claims= JwtHelper.parseJWT(authToekn);
            //todo 此处应该列出token中携带的角色表。
            List<String> roles=new ArrayList();
            roles.add("user");
            Authentication authentication1=new UsernamePasswordAuthenticationToken(
                    claims.getId(),
                    null,
                    roles.stream().map(role->new SimpleGrantedAuthority(role)).collect(Collectors.toList())
            );
            return Mono.just(authentication1);
        } catch (Exception e) {
            throw  new BadCredentialsException(e.getMessage());
        }
    }
}