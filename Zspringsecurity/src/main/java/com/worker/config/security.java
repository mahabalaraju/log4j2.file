package com.worker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class security {

	private static PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeHttpRequests((authorize)->authorize.anyRequest().authenticated()).httpBasic(Customizer.withDefaults());
		return http.build();
	}
	@Bean
	public UserDetailsService suerde() {
		UserDetails mahabala=User.builder()
				.username("mahabala")
				.password(passwordencoder().encode("raj"))
				.roles("user")
				.build();
		

		UserDetails admin=User.builder()
				.username("admin")
				.password(passwordencoder().encode("raj"))
				.roles("admin")
				.build();
		return new InMemoryUserDetailsManager(mahabala,admin);
	}
	
	@Bean
	SecurityFilterChain security(HttpSecurity http) throws Exception{
		http.csrf().disable()
		.authorizeHttpRequests((authorize)->authorize.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
	
	
	
}
