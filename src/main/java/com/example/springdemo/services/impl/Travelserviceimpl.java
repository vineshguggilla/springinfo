package com.example.springdemo.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.bean.Employeebean;
import com.example.springdemo.bean.listOfCommonAddresses;
import com.example.springdemo.bean.listOfTIdCmsAddressLink;
import com.example.springdemo.bean.listOfTIdCmsAddressTypeLink;
import com.example.springdemo.bean.jpa.Employeepojo;
import com.example.springdemo.bean.jpa.Jsonresponce;
import com.example.springdemo.bean.jpa.listOfCommonAddressespojo;
import com.example.springdemo.bean.jpa.listOfTIdCmsAddressLinkpojo;
import com.example.springdemo.bean.jpa.listOfTIdCmsAddressTypeLinkpojo;
import com.example.springdemo.repo.Travelrepo;
import com.example.springdemo.services.Travelservices;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class Travelserviceimpl implements Travelservices {

	@Autowired
	Travelrepo repo;

	@Autowired
	ModelMapper map;

	
	@Override
	public Employeepojo saveEmp(Employeebean bEmployeebean) {

		Employeepojo employeepojo1 = map.map(bEmployeebean, Employeepojo.class);

		Employeepojo employeepojo = repo.save(employeepojo1);

		return employeepojo;
	}

	@Override
	public List<Employeepojo> findbyemail1(String email3) {

		List<Employeepojo> findbyemail = repo.findByemail(email3);
		System.out.println(email3);

		return findbyemail;
	}

	public Employeepojo jsontoobject(Employeebean bean) {

		Employeebean employeebean = null;

		List<listOfCommonAddresses> listOfCommonAddresses = null;
		List<listOfCommonAddressespojo> listOfCommonAddressespojo2 = null;
		listOfCommonAddressespojo listOfCommonAddressespojo1 = null;
		List<listOfTIdCmsAddressLink> listOfTIdCmsAddressLink = null;
		List<listOfTIdCmsAddressLinkpojo> listOfTIdCmsAddressLinkpojo = null;
		List<listOfTIdCmsAddressTypeLink> listOfTIdCmsAddressTypeLink = null;
		List<listOfTIdCmsAddressTypeLinkpojo> listOfTIdCmsAddressTypeLinkpOjo = null;

		Employeebean employeebean1 = repo.saveAll(bean);

		Employeepojo employeepojo = map.map(employeebean1, Employeepojo.class);

		listOfCommonAddresses = (List<com.example.springdemo.bean.listOfCommonAddresses>) repo.saveAll(bean);
		// commonadress
		if (listOfCommonAddresses != null) {

			listOfCommonAddressespojo2 = new ArrayList<>();

			for (listOfCommonAddresses listOfCommonAddresses1 : listOfCommonAddresses) {
				listOfCommonAddressespojo1 = map.map(listOfCommonAddresses1, listOfCommonAddressespojo.class);

				listOfCommonAddressespojo2.add(listOfCommonAddressespojo1);

			}

			employeepojo.setListOfCommonAddresses(listOfCommonAddressespojo2);

		}

		return employeepojo;

	}

}
