package com.worker.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.worker.entity.worker;

@RestControllerAdvice
public class Exceptionhandler {

	@ExceptionHandler(value= {workernotfoundexception.class})
	public ResponseEntity<Object> handleexception(workernotfoundexception workernotfoundexception){
		workerException w=new workerException(
				workernotfoundexception.getMessage(),
				workernotfoundexception.getCause(),
				HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<>(w,HttpStatus.NOT_FOUND);
	}
}
