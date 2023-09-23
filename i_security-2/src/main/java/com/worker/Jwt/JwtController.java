package com.worker.Jwt;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/authenticate")
public class JwtController {

	private final jwtService jwtservice;
	private final AuthenticationManager authmanager;
	
	@PostMapping
	public String gettokenauthenticateUser(@RequestBody JwtAuthicationRequest authrequest) {
	Authentication authentication=authmanager.authenticate(new UsernamePasswordAuthenticationToken(authrequest, authrequest));
	}
	
	
	
	
}
