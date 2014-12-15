package com.zhongli.server.XMVC.domain.rent.resource;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.zhongli.server.XMVC.domain.resource.Image;
import com.zhongli.server.basic.DomainObject;
@Entity
public class Room extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private Long mainPicture;
	private int numberOfWindow;
	@OneToMany
	private List<Image> detailedPictures;
	private Date lasUpdate;
	@OneToMany
	private List<Items> items;
	@OneToOne
	private HouseINFO house;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getLasUpdate() {
		return lasUpdate;
	}
	public void setLasUpdate(Date lasUpdate) {
		this.lasUpdate = lasUpdate;
	}
	public HouseINFO getHouse() {
		return house;
	}
	public void setHouse(HouseINFO house) {
		this.house = house;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getMainPicture() {
		return mainPicture;
	}
	public void setMainPicture(Long mainPicture) {
		this.mainPicture = mainPicture;
	}
	public int getNumberOfWindow() {
		return numberOfWindow;
	}
	public void setNumberOfWindow(int numberOfWindow) {
		this.numberOfWindow = numberOfWindow;
	}
	public List<Image> getDetailedPictures() {
		return detailedPictures;
	}
	public void setDetailedPictures(List<Image> detailedPictures) {
		this.detailedPictures = detailedPictures;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	

}
