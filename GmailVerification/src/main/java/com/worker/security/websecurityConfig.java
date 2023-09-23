package com.worker.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.AllArgsConstructor;

@Configuration 
@EnableWebSecurity
@AllArgsConstructor
public class websecurityConfig {

	@Bean
	public static PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/api/vi/registeration")
		.permitAll().anyRequest().authenticated().and().formLogin().and().build();
	}
	@Bean
	public AuthenticationManager authmanager() {
	DaoAuthenticationProvider authprovider= new DaoAuthenticationProvider();
	authprovider.setUserDetailsService();
	authprovider.setPasswordEncoder(passwordencoder);
	return authprovider;
	}
}
