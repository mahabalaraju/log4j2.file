package com.mahabala.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mahabala.entity.employee;
import com.mahabala.repo.emprepository;
import com.mahabala.repo.responseHandler;
import com.mahabala.service.service;

import jakarta.validation.Valid;
import lombok.val;

@Controller
@RequestMapping("/employee")
public class empcontroller {

	@Autowired
	private emprepository emp;
	
	@Autowired
	private service ser;

	@DeleteMapping("/")
	public String delete(long id) {
		return ser.delete(id);
	}

	@PutMapping("/update")
	public String update(employee employee) {
	ser.update(employee);
	return "success";
	}

	@PostMapping
	public ResponseEntity<String> save(@RequestBody @Valid employee employee) {
		String save = ser.update(employee);
		return new ResponseEntity<String>(save, HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<employee>> getall() {
		List<employee> getall = ser.getall();
		return new ResponseEntity<List<employee>>(getall, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> geta(@PathVariable("id") long id)
	{
		return responseHandler.responsebuilder("the requested worker details are here", HttpStatus.OK, 
				ser.getbyid(id));
			}
	
}










