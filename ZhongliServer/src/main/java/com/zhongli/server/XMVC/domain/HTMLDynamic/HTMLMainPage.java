package com.zhongli.server.XMVC.domain.HTMLDynamic;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.zhongli.server.basic.DomainObject;
@Entity
public class HTMLMainPage extends DomainObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	private String name;
	private String Keyword;
	@Transient
	private GlobalStyle globalStyle;
	@OneToOne
	@Cascade(CascadeType.ALL)
	private TextUnit headTag;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<HTMLComponent> components;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public TextUnit getHeadTag() {
		return headTag;
	}
	public void setHeadTag(TextUnit headTag) {
		this.headTag = headTag;
	}
	public String getKeyword() {
		return Keyword;
	}
	public void setKeyword(String keyword) {
		Keyword = keyword;
	}
	public GlobalStyle getGlobalStyle() {
		return globalStyle;
	}
	public void setGlobalStyle(GlobalStyle globalStyle) {
		this.globalStyle = globalStyle;
	}
	public List<HTMLComponent> getComponents() {
		return components;
	}
	public void setComponents(List<HTMLComponent> componets) {
		this.components = componets;
	}
	
	
}
