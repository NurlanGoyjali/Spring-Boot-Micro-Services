package com.example.userkeycloak.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security /*extends KeycloakWebSecurityConfigurerAdapter*/ {

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

//
//    @Bean
//    protected SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
//
//        httpSecurity.cors()
//                .and().authorizeRequests()
//                      .antMatchers(HttpMethod.GET,"/user")
//                      .hasAuthority("user")
//                      .anyRequest().authenticated()
////                .and().authorizeRequests().anyRequest().authenticated()
////                .and().oauth2Login()
////                .and().logout()
//                .and().oauth2ResourceServer().jwt();
//
//        return httpSecurity.build();
//    }
//


}
