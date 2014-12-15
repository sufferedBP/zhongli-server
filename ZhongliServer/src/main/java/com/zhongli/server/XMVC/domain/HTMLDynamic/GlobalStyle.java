package com.zhongli.server.XMVC.domain.HTMLDynamic;


import com.zhongli.server.basic.DomainObject;
public class GlobalStyle extends DomainObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String name;
	private String cssName;
	private String erroMark;
	private String sucessMark;
	private String warmingMark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCssName() {
		return cssName;
	}
	public void setCssName(String cssName) {
		this.cssName = cssName;
	}
	public String getErroMark() {
		return erroMark;
	}
	public void setErroMark(String erroMark) {
		this.erroMark = erroMark;
	}
	public String getSucessMark() {
		return sucessMark;
	}
	public void setSucessMark(String sucessMark) {
		this.sucessMark = sucessMark;
	}
	public String getWarmingMark() {
		return warmingMark;
	}
	public void setWarmingMark(String warmingMark) {
		this.warmingMark = warmingMark;
	}
	
	
	

}
