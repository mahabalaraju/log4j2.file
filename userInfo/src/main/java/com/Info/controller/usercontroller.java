package com.Info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Info.Service.userService;
import com.Info.Service.userserviceImpl;
import com.Info.entity.user;

@Controller

public class usercontroller {

	@Autowired

	private userService userservice;
	
	@GetMapping("/adduser")
	public ModelAndView asdf() {
		user u=new user();
	return new ModelAndView("user_list","user",u);
	}
	
	@PostMapping("/saveuser")
	public String save(@ModelAttribute user user) {
		userservice.upsert(user);
		return "redirect:/";
	}
	@GetMapping({"/","/list"})
	public ModelAndView asdfasf() {
		List<user> list=userservice.getallusers();
		return new ModelAndView("user_info","user",list);
	}
	
}
