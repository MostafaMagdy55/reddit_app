package com.app.reddit.service.security;


import com.app.reddit.exceptions.SpringRedditException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.var;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;


import java.security.*;

import java.sql.Date;
import java.time.Instant;
import java.util.Base64;
import java.util.Random;

import static io.jsonwebtoken.Jwts.parser;
import static java.util.Date.from;

@Service
public class JwtProvider {

    private KeyStore keyStore;
    @Value("${jwt.expiration.time}")
    private Long jwtExpirationInMillis;

    private String SECRET_KEY = "very very very secret";

    public String generateToken(Authentication authentication) {
        org.springframework.security.core.userdetails.User principal = (org.springframework.security.core.userdetails.User) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject(principal.getUsername())
                .setIssuedAt(from(Instant.now()))
                .signWith(SignatureAlgorithm.HS256,generateSafeToken())
                .setExpiration(Date.from(Instant.now().plusMillis(jwtExpirationInMillis)))
                .compact();
    }

    public String generateTokenWithUserName(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(from(Instant.now()))
                .signWith(SignatureAlgorithm.HS256, generateSafeToken())

                .setExpiration(Date.from(Instant.now().plusMillis(jwtExpirationInMillis)))
                .compact();
    }


    public boolean validateToken(String jwt) {
        parser().setSigningKey( generateSafeToken()).parseClaimsJws(jwt);
        return true;
    }


    public String getUsernameFromJwt(String token) {
        Claims claims = parser()
                .setSigningKey(generateSafeToken())
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }




    public Long getJwtExpirationInMillis() {
        return jwtExpirationInMillis;
    }

    private String generateSafeToken() {
//        Random random = new Random();
//        byte[] bytes = new byte[100]; // 36 bytes * 8 = 288 bits, a little bit more than
//        // the 256 required bits
//        random.nextBytes(bytes);
//        var encoder = Base64.getUrlEncoder().withoutPadding();
//        return encoder.encodeToString(bytes);

        return "fdshgldfgdflgjjdflgljdflgjdlfjgldjflgjldsfxgljldf" +
                "jglldfgjldlfxjgldfsjxcgljdsflxcgjlvdjxclgjvdlfxc" +
                "gvxxgchvkdhxc";
    }












}
