package com.example.springdemo.bean;

import java.util.List;

import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employeebean {

	@Id
	@JsonProperty("code")
	@Size(max = 10, message = "length shold be less than 10 charecters only")
	private String code;

	
	private int lockKey ;

	private int profileKey;

	private String activeFrom;

	private String name;

	private String customerCmsOrigin;
	
	
	private List<listOfCommonAddresses> listOfCommonAddresses;


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public int getLockKey() {
		return lockKey;
	}


	public void setLockKey(int lockKey) {
		this.lockKey = lockKey;
	}


	public int getProfileKey() {
		return profileKey;
	}


	public void setProfileKey(int profileKey) {
		this.profileKey = profileKey;
	}


	public String getActiveFrom() {
		return activeFrom;
	}


	public void setActiveFrom(String activeFrom) {
		this.activeFrom = activeFrom;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCustomerCmsOrigin() {
		return customerCmsOrigin;
	}


	public void setCustomerCmsOrigin(String customerCmsOrigin) {
		this.customerCmsOrigin = customerCmsOrigin;
	}


	public List<listOfCommonAddresses> getListOfCommonAddresses() {
		return listOfCommonAddresses;
	}


	public void setListOfCommonAddresses(List<listOfCommonAddresses> listOfCommonAddresses) {
		this.listOfCommonAddresses = listOfCommonAddresses;
	}
	
	

}