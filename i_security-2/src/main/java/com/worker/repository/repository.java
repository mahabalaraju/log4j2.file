package com.worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worker.entity.user;
@Repository
public interface repository extends JpaRepository<user, Integer>{
 user finduserbyUsername(String username);
 
}
