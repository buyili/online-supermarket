package com.buyi.commons.util;

import com.buyi.constant.ResponseStatusEnum;
import com.buyi.entity.Store;
import com.buyi.entity.User;
import com.buyi.exception.GlobalException;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.util.Date;

/**
 * Created by 1132989278@qq.com on 2018/11/19 11:53
 */
public class JwtUtil {

    private static KeyPair keyPair = Keys.keyPairFor(SignatureAlgorithm.RS256);

    private static SecretKey secretKey;
    static {
        secretKey = Keys.hmacShaKeyFor("lsiefjowielsiefjowielsiefjowieby".getBytes());
    }

    private static final long expiration = 1800000;

    private static String generateJws(JwtBuilder builder) {
        Date nowDate = new Date();
        Date expirationDate = new Date(nowDate.getTime() + expiration);
        return builder
                .setIssuedAt(nowDate)
                .setExpiration(expirationDate)
                .signWith(secretKey)
                .compact();
    }

    public static String generateJws(User user) {
        JwtBuilder builder = Jwts.builder()
                .claim("userId", user.getId())
                .claim("userName", user.getName());
        return generateJws(builder);
    }

    public static String generateJws(User user, Store store) {
        JwtBuilder builder = Jwts.builder()
                .claim("userId", user.getId())
                .claim("userName", user.getName())
                .claim("storeId", store.getId())
                .claim("storeName", store.getName());
        return generateJws(builder);
    }

    public static Claims parseJws(String jws) {
        if(jws == null){
            throw new GlobalException(ResponseStatusEnum.NOT_LOGIN);
        }
        Jws<Claims> headerClaimsJwt;
        try {
            headerClaimsJwt = Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(jws);
            return headerClaimsJwt.getBody();
        } catch (JwtException ex) {
            throw new GlobalException(ResponseStatusEnum.NOT_LOGIN);
        }
    }

}
