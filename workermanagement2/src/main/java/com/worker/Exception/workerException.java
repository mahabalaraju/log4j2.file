package com.worker.Exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class workerException {

	private String message;
	private Throwable throwable;
	private HttpStatus httpstatus;
	
}
