package com.example.springdemo.bean.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



public class listOfTIdCmsAddressLinkpojo {

	@Id
	private int key;

	private int caddrCustomerKey;

	private int caddrSalesActivityKey;

	private int caddrDefaultAddress;

	private List<listOfTIdCmsAddressTypeLinkpojo> listOfTIdCmsAddressTypeLink;

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

	public List<listOfTIdCmsAddressTypeLinkpojo> getListOfTIdCmsAddressTypeLink() {
		return listOfTIdCmsAddressTypeLink;
	}

	public void setListOfTIdCmsAddressTypeLink(List<listOfTIdCmsAddressTypeLinkpojo> listOfTIdCmsAddressTypeLink) {
		this.listOfTIdCmsAddressTypeLink = listOfTIdCmsAddressTypeLink;
	}

}
