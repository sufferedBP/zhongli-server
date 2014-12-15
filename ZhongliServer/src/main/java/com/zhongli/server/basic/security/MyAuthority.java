package com.zhongli.server.basic.security;

import org.springframework.security.core.GrantedAuthority;

public class MyAuthority implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String authority;
	public MyAuthority(String authorityString){
		authority=authorityString;
	}
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}

}
