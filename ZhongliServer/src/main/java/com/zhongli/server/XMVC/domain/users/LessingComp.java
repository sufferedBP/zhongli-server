package com.zhongli.server.XMVC.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.zhongli.server.basic.DomainObject;
@Entity
public class LessingComp extends DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
