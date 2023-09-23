package com.worker.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class workerException {

	private Throwable cause;
	private String message;
	private HttpStatus httpstatus;
}
