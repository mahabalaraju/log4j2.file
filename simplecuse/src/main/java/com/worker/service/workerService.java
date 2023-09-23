package com.worker.service;

import java.util.List;
import java.util.Optional;

import com.worker.Exception.workernotfoundexception;
import com.worker.entity.worker;

public interface workerService {

	public String delete( int id);
	public List<worker> getall();
	public Optional<worker> getbyid(int id);
	public String add(worker worker);
	public String update(worker worker);
	
	
}
