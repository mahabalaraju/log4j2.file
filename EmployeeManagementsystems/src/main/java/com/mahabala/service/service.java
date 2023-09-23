package com.mahabala.service;

import java.util.List;

import com.mahabala.entity.employee;

public interface service {

	public List<employee> getall();

	public String delete(long id);

	public String add(employee id);

	public employee getbyid(long id);

	public String update(employee employee);
}
