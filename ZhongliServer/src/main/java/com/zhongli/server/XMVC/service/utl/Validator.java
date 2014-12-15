package com.zhongli.server.XMVC.service.utl;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;

import com.zhongli.server.XMVC.domain.users.BasicAccount;
import com.zhongli.server.XMVC.domain.utl.UserRegistrationObject;
import com.zhongli.server.basic.BasicServiceObject;
import com.zhongli.server.basic.DAO;

@Service
@EnableTransactionManagement
public class Validator extends BasicServiceObject {
	private static final Logger logger= LoggerFactory.getLogger(Validator.class);
	private DAO<BasicAccount> userDao;
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init(){
		logger.info("init DAOs");
		userDao=super.daoFactory.getDAOByClass(BasicAccount.class);
		
	}
	
	@Transactional
	public void validateUser(UserRegistrationObject user, Errors errors){
		
		if(userDao.getByID(user.getUserName())!=null)
			errors.rejectValue("userName", "userName.exsist", "User name "+user.getUserName()+"is unavilable");
		if(!user.getPassword().contentEquals(user.getRePassword()))
			errors.rejectValue("rePassword", "rePassword.notEqual", " Password and confirm password not match");
		
	}
	
	
}
