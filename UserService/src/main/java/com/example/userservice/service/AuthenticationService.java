//package com.example.userservice.service;
//
//import com.example.userservice.entity.AuthenticationResponse;
//import com.example.userservice.entity.User;
//import io.netty.handler.codec.MessageToByteEncoder;
//import lombok.AllArgsConstructor;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//
//import java.nio.charset.StandardCharsets;
//import java.text.MessageFormat;
//import java.util.Base64;
//
//@Service
//@AllArgsConstructor
//public class AuthenticationService {
//
//    private  UserService userService;
//    private AuthenticationManager authenticationManager;
//
//    public AuthenticationResponse response (String auth) {
//
//        if ( !StringUtils.hasText(auth) ){
//            // Dont forget for change
//            throw new RuntimeException(MessageFormat.format("Invalid aUth",auth));
//        }
//
//        String[] httpPayload = parsePeyload(auth);
//        String username = httpPayload[0];
//        String password = httpPayload[1];
//        Authentication authentication = authenticationManager
//                .authenticate( new UsernamePasswordAuthenticationToken(username,password));
//
//        User user =  (User) authentication.getPrincipal();
//        if(user == null) {
//            throw new RuntimeException("USER NOT FOUND");
//        }
//
//        User userContext = userService.getUsername(username);
//        //String jwtToken = tokenManager.generateToken(user, userContext.getId());
//        return new AuthenticationResponse(userContext.getId(),"165495874");
//
//    }
//
//    private String[] parsePeyload(String auth) {
//
//        if(auth != null && auth.toLowerCase().startsWith("basic")){
//            String base64Credentials = auth.substring("Basic".length()).trim();
//            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
//            String credentials = new String(credDecoded, StandardCharsets.UTF_8);
//            return credentials.split(":", 2);
//        }
//        return null;
//    }
//
//
//}
