package com.worker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class workernotfoundexception extends RuntimeException{


public workernotfoundexception( String msg) {
	super(msg);
	}

public workernotfoundexception(String message, Throwable cause) {
	super(message, cause);
	}
}
