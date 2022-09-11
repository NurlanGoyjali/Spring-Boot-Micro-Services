package com.example.userservice;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import com.netflix.discovery.converters.Auto;
import io.r2dbc.spi.ConnectionFactory;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import org.springframework.security.crypto.password.PasswordEncoder;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
//@EnableEurekaClient
@Log4j2
public class UserServiceApplication {

    @Autowired
    private UserRepository userRepository;


    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }




//    @Bean
//    public CommandLineRunner demo(){
//        return args -> {
//           IntStream.range(1,20)
//                   .mapToObj(this::Create)
//                  .map(userRepository::save)
//                   .collect(Collectors.toList())
//                    .forEach(x->x.subscribe(System.out::println));
//
//        };
//    }


//    @EventListener(ApplicationStartedEvent.class)
//    public void addRange (){
//        IntStream.range(0,20)
//                .mapToObj(this::Create)
//                .map(userRepository::save)
//                .collect(Collectors.toList())
//                .forEach(x-> x.subscribe(System.out::println));
//
//    }
    public User Create(int i){
        return new User().builder()
                .username("userneme"+ i)
                .password("pass"+i)
                .build();
    }
}
