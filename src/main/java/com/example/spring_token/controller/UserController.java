package com.example.spring_token.controller;


import com.example.spring_token.dto.UserLoginReq;
import com.example.spring_token.dto.UserLoginRes;
import com.example.spring_token.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {
 // 스프링 시큐리티를 추가한 순간 모든 요청에 대해 인증이 필요하다. SecurityConfig없으면 401 에러남
    private final UserService userService;

    @PostMapping("/login")
    public UserLoginRes login(@RequestBody UserLoginReq userLoginReq){
        UserLoginRes userLoginRes = userService.login(userLoginReq);
        log.info(userLoginRes.toString());
        return userLoginRes;
    }

}


