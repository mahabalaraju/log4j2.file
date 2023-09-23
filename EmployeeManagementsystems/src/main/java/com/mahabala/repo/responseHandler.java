package com.mahabala.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class responseHandler {

	public static ResponseEntity<Object> responsebuilder(String message, HttpStatus  httpstatus,
			Object responseObject){
		Map<String, Object > response=new HashMap<>();
		response.put("message", message);
		response.put("httpstatus", httpstatus);
		response.put("responseData", responseObject);
		return new ResponseEntity<Object>(response,httpstatus);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
