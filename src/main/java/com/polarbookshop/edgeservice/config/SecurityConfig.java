package com.polarbookshop.edgeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    SecurityWebFilterChain springSecurityWebFilterChain(ServerHttpSecurity http) {
        return http
                .authorizeExchange(ex -> ex.anyExchange().authenticated())
                .formLogin(Customizer.withDefaults())
                .build();
    }
}
