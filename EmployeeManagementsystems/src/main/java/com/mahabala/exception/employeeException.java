package com.mahabala.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class employeeException {

	private String message;
	private Throwable throwable;
	private HttpStatus httpstatus;
}
