package com.worker.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worker.entity.students;

import ch.qos.logback.core.model.Model;

@RestController
public class controller {
	List<students> student=new ArrayList<>();
	@RequestMapping("/students")
	public List<students> addstudents(){
		
		student.add(new students(1,"chethan","bhagath"));
    
	
		students s=new students();
		s.setId(1);
		s.setFirstname("asdf");
		s.setLastname("asdf");
		student.add(s);
		
		
		students[] as= {new students(1,"chethan","kumar"),new students(1,"kumara","jask"),
		new students(1,"kumara","asd")};
		
	   Collections.addAll(student, as);
     	return student;
		
	}
	@PostMapping("/students")
	public students student(@RequestBody students stud) {
		student.add(stud);
		return stud;
		
	}
	
}
	















