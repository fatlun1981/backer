package com.tripb.backer.security.jwt;

import java.util.Arrays;
import java.util.HashSet;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;

public class GenerateToken {
    /**
     * Generate JWT token
     */
    public static void main(String[] args) {
        String token = generateJwt();
        System.out.println(token);
    }

    public static String generateJwt(){
        String token =
           Jwt.issuer("https://example.com/issuer") 
             .upn("jdoe@quarkus.io") 
             .groups(new HashSet<>(Arrays.asList("User", "Admin"))) 
             .claim(Claims.birthdate.name(), "2001-07-13") 
           .sign();
        return token;
    }
}