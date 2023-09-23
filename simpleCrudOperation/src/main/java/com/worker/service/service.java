package com.worker.service;

import java.util.List;
import java.util.Optional;

import com.worker.entity.worker;

public interface service {

	public String delete(int id);

	public String upsert(worker work);

	public List<worker> getall();

	public worker getbyid(int id);
	
	
	
}
