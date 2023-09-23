package com.worker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worker.entity.student;
@Repository
public interface studentRepo extends JpaRepository<student, Integer> {


}
