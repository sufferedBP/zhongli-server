package com.zhongli.server.XMVC.domain.resource;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.zhongli.server.basic.DomainObject;
@SuppressWarnings("serial")
@Entity
@Table(name="image")
public class Image extends DomainObject {
	@Id
	@GeneratedValue
	private Long id;
	private Date lastUpdate;
	@Column(name="data")
	@NotNull
	@Lob
	private byte[] data;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}


}
