package com.worker.Jwt;

import java.security.Key;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;


@Service
public class jwtService {

	private static final String Secret="4B6250645367566B5970337336763979244226452948404D6351665468576D5A7134743777217A25432A462D4A614E645267556B586E3272357538782F413F44";
	public String generatetoken(String username) {
		Map<String ,Object> Claims=new HashMap<>();
		return createtoken(Claims,username);
	}

	private String createtoken(Map<String, Object> claims, String username) {
		return Jwts.builder()
				   .setClaims(claims)
				   .setSubject(username)
				   .setIssuedAt(new Date(System.currentTimeMillis()))
				   .setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
				   .signWith(getSignedKey(), SignatureAlgorithm.HS256).compact();

	}

	private Key getSignedKey() {
		byte[] keybytes=Decoders.BASE64.decode(Secret);
		return Keys.hmacShaKeyFor(keybytes); 
	
	}
	
}
