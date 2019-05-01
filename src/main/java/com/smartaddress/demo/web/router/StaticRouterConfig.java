package com.smartaddress.demo.web.router;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class StaticRouterConfig {
    @Bean
    public RouterFunction<ServerResponse> staticRouter() {
        return RouterFunctions
                .resources("/static/**", new ClassPathResource("static/"));
    }
}
