package com.worker;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/say")
public class loggerproject {

	static	Logger logger=LogManager.getLogger(LogfileApplication.class);

	@GetMapping("/hi")
	public String asfa() {
		logger.info("the controller executing..,");
		return "asdfasf";
	}
	}
