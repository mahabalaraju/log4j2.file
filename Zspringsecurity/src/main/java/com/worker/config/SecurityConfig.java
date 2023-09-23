package com.worker.config;

import javax.print.attribute.standard.JobOriginatingUserName;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

@Configuration
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain security(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeHttpRequests((authorize) -> authorize.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	SecurityFilterChain securit1y(HttpSecurity http) throws Exception{
		http.csrf().disable().authorizeHttpRequests((authorize)->authorize.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
	@Bean 
	public UserDetailsService userdetailser() {
		UserDetails mahabala=User.builder()
				.username("mahabala")
				.password(passwordEncoder().encode("raja"))
				.roles("USER")
				.build();
				
			UserDetails admin=User.builder()
				.username("admin")
				.password(passwordEncoder().encode("admin"))
				.roles("ADMIN")
				.build();
			
		return new InMemoryUserDetailsManager(mahabala,admin);
					
					
				
	}

}
