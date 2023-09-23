package com.Info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Info.entity.user;


@Controller
public class usercontroller {

	 @GetMapping("/")
	 public String asdf() {
		 return "user_info";
	 }
	 
	 
	 
	 
//	    @RequestMapping(name = "/", method = RequestMethod.GET)
//	    public ModelAndView get()  {
//	        user dto = new user();
//	        dto.setNoOfTickets(10);
//	        dto.setTicketPrice(12);
//	        return new ModelAndView("user_info", "dto", dto);
//	    }
//
//	    @RequestMapping(name = "/", method = RequestMethod.POST)
//	    public String post(@ModelAttribute("dto") user dto) {
//	        System.out.println(dto);// can process input values
//	        return "user_info";
//	    }
	}


