package com.example.springdemo.bean;

import java.util.List;

public class listOfTIdCmsAddressLink {
	
	
	
	private int key;
	
	
	private int caddrCustomerKey;
	
	private int caddrSalesActivityKey;
	
	
	private int caddrDefaultAddress;
	
	
	private List<listOfTIdCmsAddressTypeLink>listOfTIdCmsAddressTypeLink;


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	public int getCaddrCustomerKey() {
		return caddrCustomerKey;
	}


	public void setCaddrCustomerKey(int caddrCustomerKey) {
		this.caddrCustomerKey = caddrCustomerKey;
	}


	public int getCaddrSalesActivityKey() {
		return caddrSalesActivityKey;
	}


	public void setCaddrSalesActivityKey(int caddrSalesActivityKey) {
		this.caddrSalesActivityKey = caddrSalesActivityKey;
	}


	public int getCaddrDefaultAddress() {
		return caddrDefaultAddress;
	}


	public void setCaddrDefaultAddress(int caddrDefaultAddress) {
		this.caddrDefaultAddress = caddrDefaultAddress;
	}


	public List<listOfTIdCmsAddressTypeLink> getListOfTIdCmsAddressTypeLink() {
		return listOfTIdCmsAddressTypeLink;
	}


	public void setListOfTIdCmsAddressTypeLink(List<listOfTIdCmsAddressTypeLink> listOfTIdCmsAddressTypeLink) {
		this.listOfTIdCmsAddressTypeLink = listOfTIdCmsAddressTypeLink;
	}
	
	
	

}
