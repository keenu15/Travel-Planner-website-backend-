package com.java.cognizant.bp1.exception;

@SuppressWarnings("serial")
public class NotFoundException extends Exception {

	private String message;

	public NotFoundException() {
		super();
	}

	public NotFoundException(String message) {
		super();
		this.message=message;
	}

	public String getMessage() {
		return this.message;
	}
}
