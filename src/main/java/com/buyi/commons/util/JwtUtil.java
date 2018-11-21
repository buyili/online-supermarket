package com.buyi.commons.util;

import com.buyi.entity.Store;
import com.buyi.entity.User;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.KeyPair;
import java.util.Date;

/**
 * Created by 1132989278@qq.com on 2018/11/19 11:53
 */
public class JwtUtil {

    private static KeyPair keyPair = Keys.keyPairFor(SignatureAlgorithm.RS256);

    private static final long expiration = 1800000;

    private static String generateJws(JwtBuilder builder) {
        Date nowDate = new Date();
        Date expirationDate = new Date(nowDate.getTime() + expiration);
        return builder
                .setIssuedAt(nowDate)
                .setExpiration(expirationDate)
                .setExpiration(nowDate)
                .signWith(keyPair.getPrivate())
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
                .claim("storeId",store.getId())
                .claim("storeName",store.getName());
        return generateJws(builder);
    }

}
