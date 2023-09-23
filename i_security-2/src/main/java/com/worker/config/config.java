package com.worker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class config {
	@Autowired
private UserDetailsService userdetailsservice;
	@Bean
	private PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	AuthenticationProvider authprovider() {
		DaoAuthenticationProvider daoauthprovider=new DaoAuthenticationProvider();
		daoauthprovider.setUserDetailsService(userdetailsservice);
		daoauthprovider.setPasswordEncoder(passwordencoder());
		return daoauthprovider;
	}
}








