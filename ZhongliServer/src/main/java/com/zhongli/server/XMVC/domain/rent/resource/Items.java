package com.zhongli.server.XMVC.domain.rent.resource;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhongli.server.XMVC.domain.resource.Image;
import com.zhongli.server.basic.DomainObject;

@Entity
public class Items extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Autowired
	@Id
	private Long id;
	private String name;
	private Image image;
	private Date lastUpGread;
	private boolean occupied;
	@OneToMany
	private List<Image> detialedImage;
	
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public Date getLastUpGread() {
		return lastUpGread;
	}
	public void setLastUpGread(Date lastUpGread) {
		this.lastUpGread = lastUpGread;
	}
	public List<Image> getDetialedImage() {
		return detialedImage;
	}
	public void setDetialedImage(List<Image> detialedImage) {
		this.detialedImage = detialedImage;
	}

	

}
