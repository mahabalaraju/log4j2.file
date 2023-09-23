package com.worker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.servlet.ModelAndView;

import com.worker.entity.product;
import com.worker.repo.repository;
import com.worker.repo.responseHandler;
import com.worker.service.service;
import com.worker.service.serviceImpl;

import jakarta.validation.Valid;

@Controller

public class controller {

	@Autowired
	private service ser;
	
	
//	@GetMapping({"/","/home"})
//	public String masdf(Model model) {
//		int currentpage=1;
//		Page<product> page=ser.listall();
//		List<product> list=page.getContent();
//		long totalproducts=page.getTotalElements();
//		long totalpages=page.getTotalPages();
//		model.addAttribute("currentpage",currentpage);
//		model.addAttribute("productlist",list);
//		model.addAttribute("totalpages",totalpages);
//		model.addAttribute("totalproducts",totalproducts);
//		return "products";
//	}

	@GetMapping({"/","/home"})
	public String adfa(Model model) {
	 List<product> list=ser.getall();
	model.addAttribute("productlist",list);
		return "products";
	}
	@GetMapping("/addnewproducts")
	public ModelAndView add() {
		product product = new product();
		return new ModelAndView("addproduct", "product", product);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<product>> getall(Model model) {
		model.addAttribute("productlist", ser.getall());
		return ResponseEntity.ok(ser.getall());
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@RequestBody product product ) {
		return ResponseEntity.ok(ser.update(product));
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id) {
	
		return ResponseEntity.ok(ser.delete(id));
	}

	@PostMapping("/saveproduct")
	public String save(@Valid @ModelAttribute("product") product product) {
		ser.add(product);
		return "redirect:/";
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity sdfa(@PathVariable("id") int id) {
		return ResponseEntity.ok(ser.getbyid(id));
	}
	
	@GetMapping("/addnewproducts/{id}")
	public ModelAndView sa(@PathVariable("id") int id ,Model model) {
    product p=ser.getbyid(id);
    return new ModelAndView("addproduct","product",p);
	}
	
	@GetMapping("/deleteproducts/{id}")
	public String sea(@PathVariable("id") int id) {
	ser.delete(id);
		return "redirect:/";
	}

}






