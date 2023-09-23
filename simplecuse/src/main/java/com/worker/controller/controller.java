package com.worker.controller;

import java.util.List;

import org.hibernate.boot.cfgxml.internal.CfgXmlAccessServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.worker.entity.worker;
import com.worker.service.workerService;


@Controller
public class controller {
	
	@Autowired
	private workerService ser;
	
@GetMapping("/delete/{id}")
public String sdfa(@PathVariable int id) {
	ser.delete(id);
	return "redirect:/";
}

@GetMapping("/update/{id}")
public ModelAndView safasdf(@PathVariable int id) {
	worker w=ser.getbyid(id).get();
	return new ModelAndView("NewFile1","worker",w);
}
	
	@GetMapping("/")
	public ModelAndView asda() {
	List<worker> getall=ser.getall(); 
		return new ModelAndView("NewFile","worker",getall);
	}
	
	@PostMapping("/saveworker") 
	public String asdf(@ModelAttribute worker worker) {
		ser.add(worker);
	return "redirect:/";	
	}
	
	@GetMapping("/addnewemp")
	public ModelAndView asdfaa() {
		worker w=new worker();
		return new ModelAndView("NewFile1","worker",w);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
