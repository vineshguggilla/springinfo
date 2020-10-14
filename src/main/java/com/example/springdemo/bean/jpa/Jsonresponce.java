package com.example.springdemo.bean.jpa;

public class Jsonresponce {
	
	
	private String name;
	
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Jsonresponce(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	public Jsonresponce(String string, String string2, Employeepojo jsontoobject) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
