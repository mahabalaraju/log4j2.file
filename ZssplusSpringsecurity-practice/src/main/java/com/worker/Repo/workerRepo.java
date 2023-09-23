package com.worker.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worker.worker.worker;
@Repository
public interface workerRepo extends JpaRepository<worker, Integer>{
Optional<worker> findByName(String name);

}
