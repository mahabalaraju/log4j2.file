package com.worker.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.worker.worker.worker;

public class userinfouserdetails implements UserDetails{

	private String name;
	
	private String password;
	
	private List<GrantedAuthority> Authorities;
	
	public userinfouserdetails(worker worker) {
		name=worker.getName();
		password=worker.getPassword();
		Authorities=Arrays.stream(worker.getRole().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return name ;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
