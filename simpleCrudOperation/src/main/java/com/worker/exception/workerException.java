package com.worker.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
public class workerException {

	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpstatus;
}