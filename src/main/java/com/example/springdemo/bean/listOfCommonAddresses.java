package com.example.springdemo.bean;

import java.util.List;

public class listOfCommonAddresses {

	
	private int commAddressKey;
	
	private String commAddress;
	
	private int commCountryKey;
	
	private String commMobile;
	
	private String commEmail;
	
	private List<listOfTIdCmsAddressLink>listOfTIdCmsAddressLink;
	
	
	
	
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

	public List<listOfTIdCmsAddressLink> getListOfTIdCmsAddressLink() {
		return listOfTIdCmsAddressLink;
	}

	public void setListOfTIdCmsAddressLink(List<listOfTIdCmsAddressLink> listOfTIdCmsAddressLink) {
		this.listOfTIdCmsAddressLink = listOfTIdCmsAddressLink;
	}

	
	
	
}
