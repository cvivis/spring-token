# spring_token
## 프로젝트 설명

- Jwt 토큰을 활용한 인증, 인가 확인 
## 실행 방법 설명

### application.yml 
- jwt:
  token:
  secret: hihi

### build.gradle 
- jpa 관련 라이브러리
- security 관련 라이브러리
- lobok 라이브러리
- mysql 라이브러리
- jwt 관련 라이브러리 <br>
implementation 'org.springframework.boot:spring-boot-starter-data-jpa' <br>
implementation 'org.springframework.boot:spring-boot-starter-security' <br>
implementation 'org.springframework.boot:spring-boot-starter-web' <br>
compileOnly 'org.projectlombok:lombok' <br>
runtimeOnly 'com.mysql:mysql-connector-j' <br> 
annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor' <br>
annotationProcessor 'org.projectlombok:lombok' <br>
testImplementation 'org.springframework.boot:spring-boot-starter-test' <br>
testImplementation 'org.springframework.security:spring-security-test' <br>
implementation 'io.jsonwebtoken:jjwt:0.9.1' <br>  


## Endpoint설명

- localhost:8080/users/login  
ㄴ 토큰 발급하기  
ㄴ RequestBody ex)
  {
  "userName" : "kim",
  "password" : "asdf"
  }
