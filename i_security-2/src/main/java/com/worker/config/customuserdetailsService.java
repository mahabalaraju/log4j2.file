package com.worker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.worker.entity.user;
import com.worker.repository.repository;

@Service
public class customuserdetailsService implements UserDetailsService {

	@Autowired
	private repository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		user user=repo.finduserbyUsername(username);
		if(username==null) {
			throw new UsernameNotFoundException("user not found ");
		}
		return new customUserDetails(user);
	}

}















