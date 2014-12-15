package com.zhongli.server.XMVC.domain.resource;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.zhongli.server.basic.DomainObject;
@Entity
public class ContectInfo extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private int telePhoneNum;
	private String emailAddress;
	private Image photo;
	@OneToOne
	private LocalAddress address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getTelePhoneNum() {
		return telePhoneNum;
	}
	public void setTelePhoneNum(int telePhoneNum) {
		this.telePhoneNum = telePhoneNum;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Image getPhoto() {
		return photo;
	}
	public void setPhoto(Image photo) {
		this.photo = photo;
	}
	public LocalAddress getAddress() {
		return address;
	}
	public void setAddress(LocalAddress address) {
		this.address = address;
	}
	
	
}
