package com.worker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/dockertest")
	public String getdocker() {
		return "I'm going forward from springboot to docker ";
	}
}
