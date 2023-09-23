package com.mahabala.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//@RestControllerAdvice
public class exceptionhandler {
	
	@ExceptionHandler(value= {employeenotfoundexception.class})
public ResponseEntity<Object>  handleemployeenotfoexcp(employeenotfoundexception employeenotfoundexcpetion){
employeeException e=new employeeException(
		employeenotfoundexcpetion.getMessage(),
		employeenotfoundexcpetion.getCause(),
		HttpStatus.NOT_FOUND
		);
		
		return new ResponseEntity<Object>(e,HttpStatus.NOT_FOUND);
	  
}
}
