package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.bean.Employeebean;
import com.example.springdemo.services.Travelservices1;

@RestController
public class Traveljsoncompare {

	@Autowired
	Travelservices1 service;

	public ResponseEntity<Object> jsonCompare1(@RequestBody List<Employeebean> emp) {

		Object jsonCompare = service.jsonCompare(emp);
		return new ResponseEntity<Object>(jsonCompare, new HttpHeaders(), HttpStatus.OK);

	}

	
}