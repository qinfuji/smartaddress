package com.smartaddress.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static io.jsonwebtoken.SignatureAlgorithm.HS256;


@ConditionalOnProperty(prefix = "jwt", name = "enable", havingValue = "true")
@Component
public class JWTService {

    @Value("${jwt.secret-key}")
    private String secretKey;

    @Value("${jwt.validity-milliseconds}")
    private long validity;

    public String generateToken(String id , Map<String , Object> attrs) {
        Date now  = new Date();
        Map<String, Object> header = new HashMap<>();
        header.put("alg", "HS256");
        header.put("typ", "JWT");
        JwtBuilder builder =  Jwts.builder()
                .setSubject(id)
                .setIssuedAt(now)
                .setExpiration(new Date(now.getTime()+ validity))
                .signWith(HS256, getSecretKey())
                .setHeaderParams(header);
        if(attrs!=null && attrs.size()>0){
            attrs.forEach((key , value)->{
               builder.claim(key , value);
            });
        }
        return builder.compact();
    }

    public Claims getClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(getSecretKey()).parseClaimsJws(token).getBody();
    }

    public Object getUserFromToken(String token) {
        return  getClaimsFromToken(token).getSubject();
    }

    private String getSecretKey() {
        return Base64.getEncoder().encodeToString(secretKey.getBytes());
    }

}
