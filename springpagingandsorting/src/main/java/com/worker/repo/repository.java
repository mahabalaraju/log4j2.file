package com.worker.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worker.entity.product;

@Repository
public interface repository extends JpaRepository<product, Integer>{
//List<product> findbyName(String name); 
}
