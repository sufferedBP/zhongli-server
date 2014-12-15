package com.zhongli.server.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.zhongli.server.basic.config.DAOFactory;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Service
public class BasicServiceObject {
	@Autowired
	protected DAOFactory daoFactory;
	public BasicServiceObject(){
		
	}
}
