package com.worker.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worker.entity.entity;
@Repository
public interface entityrepo extends JpaRepository<entity, Integer>{
 Optional<entity> findbyname(String filename); 
}
