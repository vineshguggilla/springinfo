package com.example.springdemo.bean.jpa;

import javax.persistence.Id;


public class listOfTIdCmsAddressTypeLinkpojo {

	@Id
	private int catlAddressTypeKey;

	private int catlKey;

	private int lockKey;

	public int getCatlAddressTypeKey() {
		return catlAddressTypeKey;
	}

	public void setCatlAddressTypeKey(int catlAddressTypeKey) {
		this.catlAddressTypeKey = catlAddressTypeKey;
	}

	public int getCatlKey() {
		return catlKey;
	}

	public void setCatlKey(int catlKey) {
		this.catlKey = catlKey;
	}

	public int getLockKey() {
		return lockKey;
	}

	public void setLockKey(int lockKey) {
		this.lockKey = lockKey;
	}
	
	
	
	
	
	
	
	
	
	

}
