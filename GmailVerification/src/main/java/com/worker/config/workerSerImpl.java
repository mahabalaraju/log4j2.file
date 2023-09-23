package com.worker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.worker.repo.workerRepo;

public class workerSerImpl implements UserDetailsService{

	private static final String userNotfoundException="user not found with %s email";
	private workerRepo workrepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		return workrepo.findByEmail(email)
				.orElseThrow(()->new UsernameNotFoundException (String .format(userNotfoundException, email)) );
	}
//private final static String usernotfound="no user found with %s email";
//private workerRepo workrepo;
//
//	@Override
//	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//	
//		return workrepo.findByEmail(email)
//				.orElseThrow(()->new UsernameNotFoundException(String.format(usernotfound,email)));
//				
//	}

	
}
