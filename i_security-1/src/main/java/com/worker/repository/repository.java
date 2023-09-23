package com.worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface repository extends JpaRepository<User, Integer >{

	public boolean existsByEmail(String email);

	public User findByEmail(String email);

}
