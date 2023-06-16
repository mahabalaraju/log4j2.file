package com.worker;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogfileApplication {
	static	Logger logger=LogManager.getLogger(LogfileApplication.class);

 	public static void main(String[] args) {
		SpringApplication.run(LogfileApplication.class, args);
	
	System.out.println("hello..,");
	
	logger.trace("this is an trace msg");
	logger.debug("this is an debug msg");
	logger.info("this is an info msg");
	logger.warn("this is an warn msg");
	logger.error("this is an error msg");
	logger.fatal("this is an fatal msg");
	
	}

}
