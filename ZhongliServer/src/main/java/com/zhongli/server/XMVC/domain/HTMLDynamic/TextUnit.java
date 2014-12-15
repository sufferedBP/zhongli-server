package com.zhongli.server.XMVC.domain.HTMLDynamic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.zhongli.server.XMVC.domain.resource.Image;
import com.zhongli.server.basic.DomainObject;
@Entity
public class TextUnit extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private String name;
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Image icon;
	private String text_en;
	private String text_cn;
	private String herf;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Image getIcon() {
		return icon;
	}
	public void setIcon(Image icon) {
		this.icon = icon;
	}
	public String getText_en() {
		return text_en;
	}
	public void setText_en(String text_en) {
		this.text_en = text_en;
	}
	public String getText_cn() {
		return text_cn;
	}
	public void setText_cn(String text_cn) {
		this.text_cn = text_cn;
	}
	public String getHerf() {
		return herf;
	}
	public void setHerf(String herf) {
		this.herf = herf;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
