package com.student.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/api/list")
public class studentcontroller {

	@GetMapping("/")
	public ResponseEntity<String> getall(){
		return ResponseEntity.ok("hello from api");
	}
	
	@GetMapping("/goodafternoon")
	public ResponseEntity<String> goodafternoon(){
		return ResponseEntity.ok("good afternoon");
	}
	
	
}
