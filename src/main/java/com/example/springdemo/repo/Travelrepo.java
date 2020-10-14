package com.example.springdemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.bean.Employeebean;
import com.example.springdemo.bean.jpa.Employeepojo;

@Repository
public interface Travelrepo extends JpaRepository<Employeepojo , Integer> {
	
	
	public List<Employeepojo> findByemail(String email1);

	public Employeebean saveAll(Employeebean bean);

	

}
