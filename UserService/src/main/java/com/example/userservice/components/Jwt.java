//package com.example.userservice.components;
//
//import com.example.userservice.DTO.UserDetailsDto;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.stereotype.Component;
//
//import java.text.MessageFormat;
//import java.util.Date;
//
//@Component
//public class Jwt {
//
//    @Value("${jwt.secret}")
//    private String secret;
//    @Value("${jwt.expires}")
//    private Long expires;
//
//    public String token (Authentication auth){
//        UserDetailsDto user =(UserDetailsDto) auth.getPrincipal();
//        Date expire = new Date(new Date().getTime() + expires);
//        return io.jsonwebtoken.Jwts.builder()
//                .setSubject(user.getId().toString())
//                .setIssuedAt(new Date()).setExpiration(expire)
//                .signWith(SignatureAlgorithm.ES256,secret).compact();
//
//    }
//    public Long getUserIdByToken(String token){
//        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJwt(token).getBody();
//        return Long.parseLong(claims.getSubject());
//    }
//    public boolean tokenControl(String token) {
//        try{
//            return Jwts.parser().setSigningKey(secret)
//                    .parseClaimsJwt(token).getBody()
//                    .getExpiration().before(new Date());
//        }catch (Exception e){
//            return false;
//        }
//
//    }
//}
