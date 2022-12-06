package com.example.spring_token.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserLoginReq {
    private String userName;
    private String password;
}
