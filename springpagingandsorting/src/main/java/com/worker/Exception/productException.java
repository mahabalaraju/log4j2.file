package com.worker.Exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class productException {

	public String message;
	public Throwable cause;
	public HttpStatus httpstatus;
	
}
