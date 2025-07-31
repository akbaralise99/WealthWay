package com.WealthWay.Security.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {
    
//   
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//            .authorizeHttpRequests()
//              .requestMatchers("/api/portfolio/**").permitAll()
//              .anyRequest().authenticated()
//            .and()
//              .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
////            .and()  // need to complete this as well 
////              .authenticationProvider(authProvider())
////              .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
//        return http.build();
//    }
//   
    // authProvider(), jwtFilter, passwordEncoder()... standard setup
}
