package com.example.spring_token.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserLoginRes {
    private String userName;
    private String token;

    @Override
    public String toString() {
        return "UserLoginRes{" +
                "userName='" + userName + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
