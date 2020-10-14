package com.example.springdemo.bean.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class listOfCommonAddressespojo {

	@Id
	private int commAddressKey;
	
	private String commAddress;
	
	private int commCountryKey;
	
	private String commMobile;
	
	private String commEmail;
	
	private List<listOfTIdCmsAddressLinkpojo>listOfTIdCmsAddressLink;
	
	
	
	
	
	public int getCommAddressKey() {
		return commAddressKey;
	}

	public void setCommAddressKey(int commAddressKey) {
		this.commAddressKey = commAddressKey;
	}

	public String getCommAddress() {
		return commAddress;
	}

	public void setCommAddress(String commAddress) {
		this.commAddress = commAddress;
	}

	public int getCommCountryKey() {
		return commCountryKey;
	}

	public void setCommCountryKey(int commCountryKey) {
		this.commCountryKey = commCountryKey;
	}

	public String getCommMobile() {
		return commMobile;
	}

	public void setCommMobile(String commMobile) {
		this.commMobile = commMobile;
	}

	public String getCommEmail() {
		return commEmail;
	}

	public void setCommEmail(String commEmail) {
		this.commEmail = commEmail;
	}

	public List<listOfTIdCmsAddressLinkpojo> getListOfTIdCmsAddressLink() {
		return listOfTIdCmsAddressLink;
	}

	public void setListOfTIdCmsAddressLink(List<listOfTIdCmsAddressLinkpojo> listOfTIdCmsAddressLink) {
		this.listOfTIdCmsAddressLink = listOfTIdCmsAddressLink;
	}

	
	
	
}
