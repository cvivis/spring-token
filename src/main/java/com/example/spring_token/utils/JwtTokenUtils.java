package com.example.spring_token.utils;

import java.util.Date;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtTokenUtils {

    public static String createToken(String userName, String key, long expiredTimeMs){
        Claims claims = Jwts.claims();
        claims.put("userName", userName); // Token에 담는 정보를 Claim이라고 함
        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date(System.currentTimeMillis())) // 발생시간
                .setExpiration(new Date(System.currentTimeMillis() + expiredTimeMs)) // 기간
                .signWith(SignatureAlgorithm.HS256, key)
                .compact();
    }

}
