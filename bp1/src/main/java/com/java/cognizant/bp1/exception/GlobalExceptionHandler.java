package com.java.cognizant.bp1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@ExceptionHandler(value=NotFoundException.class)
	public ResponseEntity  notFound(NotFoundException ex) {
		return new ResponseEntity("Nothing found/empty",HttpStatus.NOT_FOUND);
	}
	
}
