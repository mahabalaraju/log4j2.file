package com.worker.Service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.worker.Entity.Roles;
import com.worker.Entity.User;
import com.worker.Repo.userRepo;
import com.worker.dto.userRegistration;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UserserviceImpl implements userService{
	
	private userRepo repo;
	
	@Override
	public User save(userRegistration reg) {
		User user=new User(reg.getEmail(),
				           reg.getFirstname(),
				           reg.getLastname(),
				           reg.getPassword()
			,Arrays.asList(new Roles("ROLE_USER")));
				
		return ;
	}

	public UserserviceImpl(userRepo repo) {
		super();
		this.repo = repo;
	}

}
