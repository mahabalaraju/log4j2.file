package com.worker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class controller {

	@ExceptionHandler(value=workernotfoundexception.class)
	public ResponseEntity<Object> workernotfoundexception(workernotfoundexception workernotfoundexception) {
		workerException workerException = new workerException(workernotfoundexception.getMessage(),
				workernotfoundexception.getCause(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<Object>(workerException, HttpStatus.NOT_FOUND);
	
	}
}