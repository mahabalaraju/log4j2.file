package com.mahabala.exception;

import org.springframework.http.HttpStatus;

public class employeenotfoundexception extends RuntimeException {

	public employeenotfoundexception(String message, Throwable cause) {
		super(message, cause);
		}

	public employeenotfoundexception(String message) {
		super(message);
		}

	
	
}
