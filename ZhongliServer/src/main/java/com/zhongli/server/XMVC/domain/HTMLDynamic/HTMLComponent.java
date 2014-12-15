package com.zhongli.server.XMVC.domain.HTMLDynamic;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.zhongli.server.XMVC.domain.resource.Image;
import com.zhongli.server.basic.DomainObject;

@Entity
public class HTMLComponent extends DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Image backGraound;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<HTMLComponent> components;
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<TextUnit> textUnits; 
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Image getBackGraound() {
		return backGraound;
	}
	public void setBackGraound(Image backGraound) {
		this.backGraound = backGraound;
	}
	public List<HTMLComponent> getComponents() {
		return components;
	}
	public void setComponents(List<HTMLComponent> components) {
		this.components = components;
	}
	public List<TextUnit> getTextUnits() {
		return textUnits;
	}
	public void setTextUnits(List<TextUnit> textUnits) {
		this.textUnits = textUnits;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
