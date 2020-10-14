package com.example.springdemo.bean.jpa;

import java.util.List;

import javax.persistence.Id;


public class Employeepojo {

	@Id

	private String code;

	private int lockKey;

	private int profileKey;

	private String activeFrom;

	private String name;

	private String customerCmsOrigin;

	private List<listOfCommonAddressespojo> listOfCommonAddresses;

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

	public List<listOfCommonAddressespojo> getListOfCommonAddresses() {
		return listOfCommonAddresses;
	}

	public void setListOfCommonAddresses(List<listOfCommonAddressespojo> listOfCommonAddresses) {
		this.listOfCommonAddresses = listOfCommonAddresses;
	}

}