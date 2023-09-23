package com.worker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worker.entity.worker;
import com.worker.exception.workernotfoundexception;
import com.worker.repository.repository;
@Service
public class serviceImpl implements service {
@Autowired
private repository repo;
	@Override
	public String delete(int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "success";
		}
		return "element not found";
	}

	@Override
	public String upsert(worker work) {
	 repo.save(work);
	return "success";
	}

	@Override
	public List<worker> getall() {
		List<worker> getall=repo.findAll();
		return getall;
	}

	@Override
	public worker getbyid(int id) {
		if(!repo.findById(id).isEmpty()) 
			throw new workernotfoundexception("worker not found with id:"+id);
	return repo.findById(id).get();
}}