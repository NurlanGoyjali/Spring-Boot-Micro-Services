package com.example.userservice.api;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/user")
@Log4j2
@AllArgsConstructor
public class UserController {

    private  UserService userService;

    @GetMapping("adduser")
    public ResponseEntity AddUser() throws Exception{
        log.info("AddUser : user created ? ");
        return ResponseEntity.ok( userService.createUser());
    }

}
@RestController
@RequestMapping("/deneme")
@Log4j2
@AllArgsConstructor
class deneme{
    private  UserService userService;

    @GetMapping("/getall")
    public Flux<User> GetAll(){
        return  userService.getAllflux();
    }
}