package com.example.springdemo.exception;

import java.util.List;

public class Exceptionresponse {
	
	private List<String> errors;

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public Exceptionresponse(List<String> errors) {
		super();
		this.errors = errors;
	}
	
	
	

}
