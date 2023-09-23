package com.worker.SecurityJwt;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class jwtAuthenticaitonfilter extends OncePerRequestFilter{
	private final JwtService jwtservice;

	
	
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		 final String authheader = request.getHeader("Authorization");
		final String token;
		final String username;
		
		if (authheader!=null&&authheader.startsWith("bearer ")) {
			token=authheader.substring(7);
			username=jwtservice.extractusernamefromtoken(token);
			
		}
		
	}

}









