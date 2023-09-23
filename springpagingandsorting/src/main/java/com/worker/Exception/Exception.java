package com.worker.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exception {

	@ExceptionHandler(productnotfoundExpception.class)
	public ResponseEntity<Object> asdf(productnotfoundExpception productnotfoundExpception){
		productException e=new productException(
				productnotfoundExpception.getMessage(),
				productnotfoundExpception.getCause(),
				HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<Object>(e,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(productalreadyfoundException.class)
	public ResponseEntity<Object> asd(productalreadyfoundException productalreadyfoundException){
		productException p=new productException(
				productalreadyfoundException.getMessage(),
				productalreadyfoundException.getCause(),
				HttpStatus.ALREADY_REPORTED
				);	
		return new ResponseEntity<Object>(p,HttpStatus.ALREADY_REPORTED);
	}
	
}
