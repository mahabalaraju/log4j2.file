package com.worker.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;


public class controller {

	@GetMapping("/say")
	public String asdf() {
		return "hi";
	}
}
