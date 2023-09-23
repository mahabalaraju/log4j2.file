package com.worker.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class responseHandler {

	public ResponseEntity<Object> responsebody(HttpStatus httpstatus,Object responseObject, String message){
		Map<String,Object> response=new HashMap<>();
		response.put("message", message);
		response.put("httpstatus", httpstatus);
		response.put("responsedata", responseObject);
		return new ResponseEntity<Object>(response,httpstatus);
	}
}
