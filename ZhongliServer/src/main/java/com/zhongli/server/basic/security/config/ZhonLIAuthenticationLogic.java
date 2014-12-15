package com.zhongli.server.basic.security.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import com.zhongli.server.XMVC.domain.users.BasicAccount;
import com.zhongli.server.basic.security.MyAuthority;
@Component
public class ZhonLIAuthenticationLogic implements AuthenticationLogic, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(ZhonLIAuthenticationLogic.class);
	@Autowired
	private SecurityConfig config;
	
	public Collection<? extends GrantedAuthority> getAuthoriy(BasicAccount account){
		if(account.getUserName()==null){
			logger.debug("eligal input, returnning null");
			return null;
		}
		List<MyAuthority> result=new ArrayList<MyAuthority>();
		logger.debug("Start get Authorith of user:"+account.getUserName()+"as defualt");
		result.add(getAuthByString(config.getBasicIdentifier()));
		// set auth by attribute
		if(account.getAdmin()!=null){
			logger.debug("find User: "+account.getUserName()+" have rolle "+config.getMainAdminIdentifier());
			result.add(getAuthByString(config.getMainAdminIdentifier()));
		}
		if(account.getComp()!=null){
			logger.debug("find User: "+account.getUserName()+" have rolle "+config.getLessingCompanyIdentifier());
			result.add(getAuthByString(config.getLessingCompanyIdentifier()));
		}
		if(account.getLessor()!=null){
			logger.debug("find User: "+account.getUserName()+" have rolle "+config.getLessorIdentifier());
			result.add(getAuthByString(config.getLessorIdentifier()));
		}
		if(account.getCustomer()!=null){
			logger.debug("find User: "+account.getUserName()+" have rolle "+config.getCustommerIdentifier());
			result.add(getAuthByString(config.getCustommerIdentifier()));
		}
		
		
	
		return result;
	}
	private MyAuthority getAuthByString(String authorityByString ){
		return new MyAuthority(authorityByString);
	}
}
