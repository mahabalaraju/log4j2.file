package com.mahabala.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahabala.entity.employee;
@Repository
public interface emprepository extends JpaRepository<employee, Long>{

}
