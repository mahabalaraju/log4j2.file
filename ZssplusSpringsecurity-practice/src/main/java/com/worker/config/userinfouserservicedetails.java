package com.worker.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.worker.Repo.workerRepo;
import com.worker.worker.worker;

public class userinfouserservicedetails implements UserDetailsService {

	@Autowired
	private workerRepo workrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	Optional<worker> userInfo=workrepo.findByName(username);
		
	return userInfo.map(userinfouserdetails::new)
			.orElseThrow(()->new UsernameNotFoundException("user not found "+username));
	}

}
