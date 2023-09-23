package com.worker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worker.entity.laptop;
@Repository
public interface laptopRepo extends JpaRepository<laptop, Integer> {

}
