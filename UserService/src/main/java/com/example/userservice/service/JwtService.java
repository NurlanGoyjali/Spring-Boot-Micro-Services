//package com.example.userservice.service;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//@Service
//public class JwtService implements UserDetailsService {
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        if ("deneme".equals(username)){
//            return new User("deneme","fjabjfbnlmfds",new ArrayList<>());
//        }else{
//            throw new UsernameNotFoundException("User not found with username: " + username);
//
//        }
//    }
//}
