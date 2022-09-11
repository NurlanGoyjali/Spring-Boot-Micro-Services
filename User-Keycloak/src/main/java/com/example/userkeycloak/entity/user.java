package com.example.userkeycloak.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class user {
    @Id
    private Long id;
    private String username;
    private String password;
    private Date createAt;

}
