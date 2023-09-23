package com.worker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/docker-demo")
	public String dcoer() {
		return "welcome to the docker project";
	}
}
