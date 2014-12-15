package com.zhongli.server.XMVC.domain.rent.resource;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.zhongli.server.XMVC.domain.resource.Image;
import com.zhongli.server.XMVC.domain.resource.LocalAddress;
import com.zhongli.server.basic.DomainObject;
@Entity
public class HouseINFO extends DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private int bedRoomeValue;
	private int livingRoomeValue;
	private int BathRoomValue;
	private int AvaibleParkingSpot;
	private int prakinSpotPrice;
	private String Discription;
	private Long headerImage;
	@OneToMany
	private List<Room> rooms;
	@OneToMany
	private List<Image> detailedImage;
	@OneToMany
	private List<Image> strctureImage;
	@OneToMany
	private List<Items> items;
	private int tellNum;
	@NotNull
	private LocalAddress address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getBedRoomeValue() {
		return bedRoomeValue;
	}
	public void setBedRoomeValue(int bedRoomeValue) {
		this.bedRoomeValue = bedRoomeValue;
	}
	public int getLivingRoomeValue() {
		return livingRoomeValue;
	}
	public void setLivingRoomeValue(int livingRoomeValue) {
		this.livingRoomeValue = livingRoomeValue;
	}
	public int getBathRoomValue() {
		return BathRoomValue;
	}
	public void setBathRoomValue(int bathRoomValue) {
		BathRoomValue = bathRoomValue;
	}
	public int getAvaibleParkingSpot() {
		return AvaibleParkingSpot;
	}
	public void setAvaibleParkingSpot(int avaibleParkingSpot) {
		AvaibleParkingSpot = avaibleParkingSpot;
	}
	public int getPrakinSpotPrice() {
		return prakinSpotPrice;
	}
	public void setPrakinSpotPrice(int prakinSpotPrice) {
		this.prakinSpotPrice = prakinSpotPrice;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
	public Long getHeaderImage() {
		return headerImage;
	}
	public void setHeaderImage(Long headerImage) {
		this.headerImage = headerImage;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public List<Image> getDetailedImage() {
		return detailedImage;
	}
	public void setDetailedImage(List<Image> detailedImage) {
		this.detailedImage = detailedImage;
	}
	public List<Image> getStrctureImage() {
		return strctureImage;
	}
	public void setStrctureImage(List<Image> strctureImage) {
		this.strctureImage = strctureImage;
	}
	public int getTellNum() {
		return tellNum;
	}
	public void setTellNum(int tellNum) {
		this.tellNum = tellNum;
	}
	public LocalAddress getAddress() {
		return address;
	}
	public void setAddress(LocalAddress address) {
		this.address = address;
	}
	
}
