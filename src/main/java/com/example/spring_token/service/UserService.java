package com.example.spring_token.service;

import com.example.spring_token.dto.UserLoginReq;
import com.example.spring_token.dto.UserLoginRes;
import com.example.spring_token.utils.JwtTokenUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    @Value("${jwt.token.secret}")//spring 제공 라이브러리
    private String secretKey;
    private long expiredTimeMs = 1000 * 60 * 60;


    public UserLoginRes login(UserLoginReq userLoginReq){
        String token = JwtTokenUtils.createToken(userLoginReq.getUserName(), secretKey, expiredTimeMs);
        log.info(token);
        return new UserLoginRes(userLoginReq.getUserName(), token);
    }


}
