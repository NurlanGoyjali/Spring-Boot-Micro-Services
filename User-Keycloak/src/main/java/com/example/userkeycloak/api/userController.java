package com.example.userkeycloak.api;

import com.example.userkeycloak.config.Security;
import com.example.userkeycloak.dto.userDto;
import com.example.userkeycloak.service.userService;
import com.google.inject.Inject;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.web.servlet.oauth2.client.OAuth2ClientSecurityMarker;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.ws.rs.Produces;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/user")
@Log4j2
public class userController {
/*
    private final userService userService;
    private final ModelMapper mapper;


    public userController(com.example.userkeycloak.service.userService userService,
                          ModelMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;

    }



    @GetMapping("/findall")
    public Flux<userDto> FindAll(){
        return userService.findAll().map(x->mapper.map(x,userDto.class));

    }

    @GetMapping("/us")
    public ResponseEntity sayhi(){
         return ResponseEntity.ok("hi");
    }

    @GetMapping("/userinfo")
    public ResponseEntity info(){




        return ResponseEntity.ok( "user info " );
    }

    @GetMapping(path = "/users")
    public ResponseEntity GetUsers(Principal principal  ){

        return ResponseEntity.ok(principal.getName());
    }

    @GetMapping(path = "/username")
    public ResponseEntity GetUserName(Principal principal  ){
        List<String> list = new ArrayList<>();
        var deneme = principal.getClass();


        list.add(deneme.getCanonicalName());

        return ResponseEntity.ok(list);
    }
*/
}


