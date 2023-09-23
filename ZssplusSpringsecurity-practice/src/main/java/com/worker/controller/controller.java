package com.worker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import com.worker.worker.worker;

import ch.qos.logback.core.model.Model;

@Controller
public class controller {
	List<worker> list=new ArrayList<>();
	
	@GetMapping("/ADMIN")
	String asdf() {
		return "WELCOME:ADMIN";
	}

	@GetMapping({"/","/list"})
	public ModelAndView getallemployees() {
		ModelAndView mv=new ModelAndView();
	return new ModelAndView("home","user",list);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/addworkers")
	public ModelAndView adfas()
	{
		worker w=new worker();
		return new ModelAndView("hello","user",w);
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute worker user){
	list.add(user);
		 return "redirect:/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
