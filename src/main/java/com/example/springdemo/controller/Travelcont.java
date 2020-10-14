package com.example.springdemo.controller;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.bean.Employeebean;
import com.example.springdemo.bean.jpa.Employeepojo;
import com.example.springdemo.bean.jpa.Jsonresponce;
import com.example.springdemo.services.Travelservices;

@RestController
@RequestMapping("/travlogix")
public class Travelcont {

	@Autowired
	Travelservices service;

	@PostMapping("/saveEmp")
	public ResponseEntity<Employeepojo> saveEmployee(@RequestBody @Valid Employeebean bEmployeebean) {

		Employeepojo saveEmp = service.saveEmp(bEmployeebean);

		return new ResponseEntity<Employeepojo>(saveEmp, new HttpHeaders(), HttpStatus.OK);

	}

	
	@GetMapping("/findbyemail1/")
	public ResponseEntity<List<Employeepojo>> findbyEmail2(@PathParam("email")String email4) {
		
		List<Employeepojo> findbyemail2 = service.findbyemail1(email4);
		
		System.out.println(email4);
		
		return new ResponseEntity<List<Employeepojo>>(findbyemail2,new HttpHeaders(),HttpStatus.OK);

	}
	
	
	
	@GetMapping(value="/jsntoobj")
	public   Jsonresponce jsontoobject(@RequestBody Employeebean bean) {
		
		
		
		return new Jsonresponce("jsontojava", "success",service.jsontoobject( bean));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
