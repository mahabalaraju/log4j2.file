package com.worker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.worker.repository.repository;

public class userServiceImpl implements UserService{
	@Autowired
	private repository userRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncode;

	@Override
	public User createUser(User user) {

		user.setPassword(passwordEncode.encode(user.getPassword()));
		user.setRole("ROLE_USER");

		return userRepo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {

		return userRepo.existsByEmail(email);
	

	}
}
