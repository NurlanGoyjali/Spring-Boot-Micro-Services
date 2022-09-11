package com.example.userkeycloak.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class userDto {


    private String id;
    private String username;
    private Date createAt;


}
