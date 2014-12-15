package com.zhongli.server.basic.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.zhongli.server.XMVC.domain.users.BasicAccount;
import com.zhongli.server.basic.security.config.AuthenticationLogic;
public class MyUserDetials implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BasicAccount account;
	private AuthenticationLogic authLogic;

	public MyUserDetials(BasicAccount account){
		this.account=account;
	}
	
	public void setAuthLogic(AuthenticationLogic authLogic) {
		this.authLogic = authLogic;
	}

	
	public BasicAccount getAccount() {
		return account;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authLogic.getAuthoriy(account);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return account.getPassword();
		
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return account.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
