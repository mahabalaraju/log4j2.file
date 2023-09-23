package com.worker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worker.Entity.User;
@Repository
public interface userRepo extends JpaRepository<User, Long> {

	
}
