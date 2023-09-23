package com.worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.worker.entity.worker;
@Repository
public interface workerRepo extends JpaRepository<worker, Integer>{

	
}
