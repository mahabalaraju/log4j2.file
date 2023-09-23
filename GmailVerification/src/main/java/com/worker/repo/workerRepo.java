package com.worker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worker.entity.worker;
import java.util.*;
public interface workerRepo extends JpaRepository<worker, Integer> {
Optional<worker> findByEmail(String email);
	
}
