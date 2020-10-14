package com.example.springdemo.services;

import java.util.List;

import com.example.springdemo.bean.Employeebean;
import com.example.springdemo.bean.jpa.Employeepojo;
import com.example.springdemo.bean.jpa.Jsonresponce;


public interface Travelservices {

	public Employeepojo saveEmp(Employeebean bEmployeebean);
	
	
	public List<Employeepojo> findbyemail1(String email2);


	public Employeepojo jsontoobject( Employeebean bean);
	
	
	
}
