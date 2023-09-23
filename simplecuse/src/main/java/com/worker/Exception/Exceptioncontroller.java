package com.worker.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptioncontroller {

	@ExceptionHandler(workernotfoundexception.class)
	public ResponseEntity<Object> asdf(workernotfoundexception workernotfoundexception) {
		workerException e = new workerException(
				workernotfoundexception.getCause(),
				workernotfoundexception.getMessage(),
				HttpStatus.NOT_FOUND
				);
 return new ResponseEntity<Object>(e,HttpStatus.NOT_FOUND);
	}
}
