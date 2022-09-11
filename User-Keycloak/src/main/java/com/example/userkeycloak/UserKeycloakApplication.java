package com.example.userkeycloak;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
//@EnableWebSecurity
@EnableEurekaClient
public class UserKeycloakApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserKeycloakApplication.class, args);
    }

//    @Bean
//    ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory){
//       ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
//       initializer.setConnectionFactory(connectionFactory);
//       initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));
//        return initializer;
//    }


}

