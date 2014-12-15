package com.zhongli.server.basic.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.zhongli.server.XMVC.domain.users.BasicAccount;
import com.zhongli.server.XMVC.service.users.UserService;
import com.zhongli.server.basic.security.config.AuthenticationLogic;

public class MyUserService implements UserDetailsService {
	@Autowired
	private UserService myUserService;
	@Autowired
	private AuthenticationLogic authLogic; 
	

	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		BasicAccount account=myUserService.getUser(arg0);
		if(account==null){
			throw new UsernameNotFoundException("User:"+arg0+"not found");
		}
		
		MyUserDetials user=new MyUserDetials(account);
		user.setAuthLogic(authLogic);
		return user;
	}

}
