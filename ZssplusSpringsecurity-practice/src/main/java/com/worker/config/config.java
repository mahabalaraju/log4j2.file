package com.worker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@EnableWebSecurity
@EnableMethodSecurity
@Configuration
public class config {

	@Bean
	public static PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {
//		http.csrf().disable()
//		.authorizeHttpRequests((authorize)->authorize.anyRequest().authenticated()
//				).httpBasic(Customizer.withDefaults()
//						);
//		return http.build();
//	}
//	
	
	@Bean
	public SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {
		return http.csrf().disable()
				.authorizeHttpRequests()
				.requestMatchers("/products/welcome","/products/new")
				.permitAll().and()
				.authorizeHttpRequests().requestMatchers("/products/**")
				.authenticated().and().formLogin().and().build();
	}
	
	@Bean
	public AuthenticationProvider authenticationprovider() {
		DaoAuthenticationProvider authprovider=new DaoAuthenticationProvider();
		authprovider.setUserDetailsService(userDetailsService());
		authprovider.setPasswordEncoder(passwordEncoder());
return authprovider;
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails mahabala=User.builder()
				.username("mahabala")
				.password(passwordEncoder().encode("raju"))
				.roles("user")
				.build();
		
		UserDetails admin=User.builder()
				.username("admin")
				.password(passwordEncoder().encode("minister"))
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(mahabala,admin);
	}
	
}
