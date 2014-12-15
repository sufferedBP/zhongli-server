package com.zhongli.server.basic.security.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.zhongli.server.XMVC.domain.users.BasicAccount;
import com.zhongli.server.basic.security.MyUserDetials;

public class MyAuthenticationSucessHandeler implements
		AuthenticationSuccessHandler {

	@Autowired
	private SecurityConfig config;
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication auth)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		for(GrantedAuthority gAuth: auth.getAuthorities() ){
			if(gAuth.getAuthority().contentEquals(config.getLessingCompanyIdentifier())){
				response.sendRedirect("/webpage/user/lessingCompany/");
				break;
			}
			if(gAuth.getAuthority().contentEquals(config.getLessorIdentifier())){
				response.sendRedirect("/webpage/user/lessor/");
				break;
			}
			if(gAuth.getAuthority().contentEquals(config.getLessorIdentifier())){
				response.sendRedirect("/webpage/user/custommer/");
				break;
			}
			if(gAuth.getAuthority().contentEquals(config.getMainAdminIdentifier())){
				response.sendRedirect("/webpage/admin/");
				break;
			}
				
		}
		
	}
	private BasicAccount getUserFromAuth(Authentication auth){
		Object principal= auth.getPrincipal();
		BasicAccount resualt=null;
		if(principal instanceof MyUserDetials){
			MyUserDetials userDetials=(MyUserDetials)principal;
			resualt=userDetials.getAccount();
		}
		return resualt;
		
	}

}
