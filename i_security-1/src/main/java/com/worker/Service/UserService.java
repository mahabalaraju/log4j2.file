package com.worker.Service;

import org.springframework.security.core.userdetails.User;

public interface UserService {
	public User createUser(User user);

	public boolean checkEmail(String email);


}
