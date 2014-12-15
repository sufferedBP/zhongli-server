package com.zhongli.server.basic.security.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.zhongli.server.XMVC.domain.users.BasicAccount;

public interface AuthenticationLogic {
	public Collection<? extends GrantedAuthority> getAuthoriy(BasicAccount account);

}
