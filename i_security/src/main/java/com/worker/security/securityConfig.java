package com.worker.security;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class securityConfig {

	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	//Authentication 
	public UserDetailsService userdetails() {
//		UserDetails user=User.builder()
//				.username("maha")
//				.password("raja")
//				.roles("admin")
//				.build();
//		UserDetails user1=User.withUsername("user")
//				.password("name")
//				.roles("user")
//				.build();
//		return new InMemoryUserDetailsManager(user,user1);
	return new userInfouserdetailsmanager();
	}
	
	@Bean
	SecurityFilterChain securityfilterchain(HttpSecurity http) {
		http.csrf().disable()
		.authorizeHttpRequests().
		requestMatchers("/employee/add/", "/employee/all").permitAll()
		.anyRequest()
		.authenticated()
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.authenticationProvider(authenticationprovider())
		.addfilterbefore(AuthenticationFilter,UsernamePasswordAuthenticationFilter.class)
		return http.build();
	}
	
	@Bean
	public AuthenticationProvider authenticationprovider() {
		var authenticationprovider=new DaoAuthenticationProvider();
		authenticationprovider.setUserDetailsService(userdetails());
		authenticationprovider.setPasswordEncoder(passwordencoder());
		return authenticationprovider;
	}
	@Bean
	public AuthenticationManager authmanager(AuthenticationConfiguration authconfig) throws Exception {
		return authconfig.getAuthenticationManager();
	}
}









