package com.example.userservice.config;


import com.example.userservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableWebSecurity
@EnableReactiveMethodSecurity
@AllArgsConstructor
public class SecurityConfig  {

  private UserService userService;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Bean
    public ReactiveUserDetailsService userDetailsService(){

        var u1 = User.withUsername("bill")
                .password("12345")
                .authorities("admin")
                .build();

       /* var user = userService.getAll();
        Collection<UserDetails> collection = new ArrayList<UserDetails>(user);
        collection.add(u1);*/
        return new MapReactiveUserDetailsService(u1);
    }

    @SneakyThrows
    @Bean
    public SecurityWebFilterChain filterChain(ServerHttpSecurity http){

        return http.httpBasic()
                .and()
                    .authorizeExchange().pathMatchers("/user/**").authenticated()
                    .anyExchange().permitAll()
                .and()
                    .build();
    }



//    @Autowired
//    public void configureGlobal(@NotNull AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService)
//                .passwordEncoder(bCryptPasswordEncoder);
//    }


}
