package com.smartaddress.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.web.server.context.ServerSecurityContextRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@ConditionalOnProperty(prefix = "jwt", name = "enable", havingValue = "true")
@Component
public class SecurityContextRepository implements ServerSecurityContextRepository {
    private static final String BEARER = "Bearer ";
    @Autowired
    private  AuthenticationManager authenticationManager;


    public SecurityContextRepository(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Mono<Void> save(ServerWebExchange serverWebExchange, SecurityContext securityContext) {
        return Mono.empty();
    }

    @Override
    public Mono<SecurityContext> load(ServerWebExchange serverWebExchange) {
        return Mono.justOrEmpty(serverWebExchange.getRequest().getHeaders().getFirst(AUTHORIZATION))
                .filter(s -> s.startsWith(BEARER))
                .map(subs -> subs.substring(BEARER.length()))
                .flatMap(authToken -> Mono.just(new UsernamePasswordAuthenticationToken(authToken, authToken)))
                .flatMap(auth -> authenticationManager.authenticate(auth).map(SecurityContextImpl::new));
    }
}