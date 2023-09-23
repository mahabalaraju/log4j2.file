package com.worker.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.worker.entity.product;


public interface service  {

	public String add(product product);
	public String delete(int id);
	public product getbyid(int id);
	public String update (product product);
	public List<product> getall();
	//public Page<product> listall();
}
