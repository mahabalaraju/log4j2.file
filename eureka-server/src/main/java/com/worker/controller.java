package com.worker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {

	@GetMapping("/say")
	public String geta() {
		return "hello";
	}
}
