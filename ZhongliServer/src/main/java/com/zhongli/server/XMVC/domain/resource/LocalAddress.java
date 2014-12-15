package com.zhongli.server.XMVC.domain.resource;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.zhongli.server.basic.DomainObject;

@SuppressWarnings("serial")
@Entity
public class LocalAddress extends DomainObject {
	

	@Id
	private String id;
	private String country;
	private String state;
	private String addressLine1;
	private String addressline2;
	private Integer zipCode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	

}
