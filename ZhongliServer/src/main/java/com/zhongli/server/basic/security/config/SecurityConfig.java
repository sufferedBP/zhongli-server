package com.zhongli.server.basic.security.config;

import java.io.Serializable;


public class SecurityConfig implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String custommerIdentifier;
	private String lessingCompanyIdentifier;
	private String lessorIdentifier;
	private String basicIdentifier;
	private String mainAdminIdentifier;
	
	public String getMainAdminIdentifier() {
		return mainAdminIdentifier;
	}
	public void setMainAdminIdentifier(String mainAdminIdentifier) {
		this.mainAdminIdentifier = mainAdminIdentifier;
	}
	public String getCustommerIdentifier() {
		return custommerIdentifier;
	}
	public void setCustommerIdentifier(String custommerIdentifier) {
		this.custommerIdentifier = custommerIdentifier;
	}
	public String getLessingCompanyIdentifier() {
		return lessingCompanyIdentifier;
	}
	public void setLessingCompanyIdentifier(String lessingCompayIdentifier) {
		this.lessingCompanyIdentifier = lessingCompayIdentifier;
	}
	public String getLessorIdentifier() {
		return lessorIdentifier;
	}
	public void setLessorIdentifier(String lessorIdentifier) {
		this.lessorIdentifier = lessorIdentifier;
	}
	public String getBasicIdentifier() {
		return basicIdentifier;
	}
	public void setBasicIdentifier(String basicIdentifier) {
		this.basicIdentifier = basicIdentifier;
	}
	
	
	

}
