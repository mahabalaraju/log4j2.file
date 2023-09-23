package com.mahabala.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahabala.entity.employee;
import com.mahabala.exception.employeenotfoundexception;
import com.mahabala.exception.noemployeefoundexception;
import com.mahabala.exception.userexistsalready;
import com.mahabala.repo.emprepository;
@Service
public class serviceImpl implements service {
@Autowired
private emprepository emprepo;
	@Override
	public List<employee> getall() {
		List<employee> listofemployees=emprepo.findAll();
		return listofemployees;
	}

	@Override
	public String delete(long id) {
	if(emprepo.findById(id) != null) {
	emprepo.deleteById(id);
	return "success";
	}
	else
		return "element not found";
	}

	

	@Override
	public employee getbyid(long id) {
		Optional<employee> getbyid=emprepo.findById(id);
		if(getbyid.isPresent())
		{
		return 	getbyid.get();	
		}
		else 
		throw new employeenotfoundexception("employee not found with id"+id);
		
	}

	@Override
	public String add(employee id) {
		employee exitingemployee=emprepo.findById(id.getId()
				).orElse(null
						);
		if(exitingemployee==null) {
			emprepo.save(id);
			return "employee added successfully";
		}
		else 
			throw new userexistsalready("user already exists!");
	}

	@Override
	public String update(employee employee) {
	employee existingemployee=emprepo.findById(employee.getId()).orElse(null);
	if(existingemployee==null) {
		throw new noemployeefoundexception("no such employee exists! ");
	}
	else
		existingemployee.setDepartment(employee.getName());
	existingemployee.setDepartment(employee.getDepartment());
	existingemployee.setEmail(employee.getEmail());
	emprepo.save(existingemployee);
	return "successfully updatedt";
		
	}

	
}
