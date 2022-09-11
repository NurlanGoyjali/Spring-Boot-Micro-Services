package com.example.userservice.repository;

import com.example.userservice.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.Optional;

public interface UserRepository extends ReactiveCrudRepository<User,Long> {

    Optional<User> findByUsername(String username);

}
