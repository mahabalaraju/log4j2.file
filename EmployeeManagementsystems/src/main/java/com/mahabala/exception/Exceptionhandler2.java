package com.mahabala.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exceptionhandler2 {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException .class)
	public Map<String,String> handleException(MethodArgumentNotValidException ex){
		Map<String ,String> Errors=new HashMap<>();
		ex.getBindingResult().
		getFieldErrors().forEach(error->Errors.put(error.getField(),error.getDefaultMessage()));
		return Errors;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(employeenotfoundexception.class)
	public Map<String,Object> handleExceptio(employeenotfoundexception employeenotfoundexception){
		Map<String,Object> error=new HashMap<>();
		error.put("error",employeenotfoundexception.getMessage());
		error.put("http-status", employeenotfoundexception.getCause());
		error.put("throwble", HttpStatus.NOT_FOUND);
		return error;
	}
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(userexistsalready.class)
	public Map<String,Object> handleExceptio(userexistsalready employeenotfoundexception){
		Map<String,Object> error=new HashMap<>();
		error.put("error",employeenotfoundexception.getMessage());
		error.put("http-status", employeenotfoundexception.getCause());
		error.put("throwble", HttpStatus.NOT_FOUND);
		return error;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(noemployeefoundexception.class)
	public Map<String,Object> handleExceptio(noemployeefoundexception employeenotfoundexception){
		Map<String,Object> error=new HashMap<>();
		error.put("error",employeenotfoundexception.getMessage());
		error.put("http-status", employeenotfoundexception.getCause());
		error.put("throwble", HttpStatus.NOT_FOUND);
		return error;
	}
	
}












