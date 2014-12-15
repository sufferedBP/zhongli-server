package com.zhongli.server.XMVC.domain.users;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.zhongli.server.XMVC.domain.resource.ContectInfo;
import com.zhongli.server.basic.DomainObject;
@Entity
public class BasicAccount extends DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@NotEmpty
	private String userName;
	@NotNull
	@Size()
	private String password;
	private Date creationDate;
	@OneToOne
	private ContectInfo contectInfo;
	@OneToOne
	private Custommer customer;
	@OneToOne
	private LessingComp comp;
	@OneToOne
	private Lessor Lessor;
	private MainAdmin admin;
	
	public MainAdmin getAdmin() {
		return admin;
	}
	public void setAdmin(MainAdmin admin) {
		this.admin = admin;
	}
	public BasicAccount(){
		
	}
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
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public ContectInfo getContectInfo() {
		return contectInfo;
	}
	public void setContectInfo(ContectInfo contectInfo) {
		this.contectInfo = contectInfo;
	}
	public Custommer getCustomer() {
		return customer;
	}
	public void setCustomer(Custommer customer) {
		this.customer = customer;
	}
	public LessingComp getComp() {
		return comp;
	}
	public void setComp(LessingComp comp) {
		this.comp = comp;
	}
	public Lessor getLessor() {
		return Lessor;
	}
	public void setLessor(Lessor lessor) {
		Lessor = lessor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
}
