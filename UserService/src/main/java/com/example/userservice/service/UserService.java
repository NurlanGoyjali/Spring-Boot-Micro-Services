package com.example.userservice.service;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Log4j2
@AllArgsConstructor
public class UserService   {

    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder encoder;


    public Mono<User> createUser(){
        var date =  LocalDateTime.now();
    var user = new User("nurlan",  "1234",date,date );
    log.info("kullanıcı : "+ user);
     return userRepository.save(user);

    }

    public List<UserDetails> getAll(){
        return userRepository.findAll().toStream().collect(Collectors.toList());
    }

    public Flux<User> getAllflux(){
        return userRepository.findAll();
    }


    public User getUsername(String username){
        return userRepository.findAll().toStream().filter(x->x.getUsername().equals(username))
                .findFirst().orElse(null);

    }


}
