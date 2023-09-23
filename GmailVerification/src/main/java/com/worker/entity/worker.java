package com.worker.entity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="registration")
public class worker implements UserDetails {

	@Id
	@SequenceGenerator(
		name="student_sequence",
		sequenceName="student_sequence",
		allocationSize=1
	)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
		    generator=""	
			)
	private int id;
	private String username;
	private String name;
	private String password;
	private String email;
	private String roles;
	private boolean locked;
	private boolean enabled;
	
	@Enumerated(EnumType.STRING)
	private appUserRole appUserRole;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 SimpleGrantedAuthority authority=new SimpleGrantedAuthority(appUserRole.name());
		return Collections.singletonList(authority);
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return !locked;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
