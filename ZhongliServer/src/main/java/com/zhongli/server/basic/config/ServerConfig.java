package com.zhongli.server.basic.config;



public class ServerConfig {
	private String ormType;
	private String defualMark;
	private String hibernateSessionMark;
	private String domainPrefix;
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHibernateSessionMark() {
		return hibernateSessionMark;
	}
	public void setHibernateSessionMark(String hibernateSessionMark) {
		this.hibernateSessionMark = hibernateSessionMark;
	}
	public String getOrmType() {
		return ormType;
	}
	public void setOrmType(String ormType) {
		this.ormType = ormType;
	}
	public String getDefualMark() {
		return defualMark;
	}
	public void setDefualMark(String defualMark) {
		this.defualMark = defualMark;
	}
	public String getDomainPrefix() {
		return domainPrefix;
	}
	public void setDomainPrefix(String domainPrefix) {
		this.domainPrefix = domainPrefix;
	}
	
	

}
