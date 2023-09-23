package com.worker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worker.entity.worker;

@Repository
public interface workerRepo extends JpaRepository<worker,Integer> {

}
