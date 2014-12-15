package com.zhongli.server.XMVC.service.users;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.zhongli.server.XMVC.domain.users.BasicAccount;
import com.zhongli.server.XMVC.domain.users.Lessor;
import com.zhongli.server.XMVC.domain.users.MainAdmin;
import com.zhongli.server.XMVC.domain.utl.UserRegistrationObject;
import com.zhongli.server.basic.BasicServiceObject;
import com.zhongli.server.basic.DAO;
import com.zhongli.server.basic.config.ServerConfig;
@Service
@EnableTransactionManagement
@SuppressWarnings("unchecked")
public class UserService extends BasicServiceObject {

	private DAO<BasicAccount> userDao;
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private ServerConfig config;
	@PostConstruct
	public void init(){
		logger.info("init DAOs");
		userDao=super.daoFactory.getDAOByClass(BasicAccount.class);
	}
	@Transactional
	public void buildDefualt(){
		logger.info("building defualt");
		DAO<MainAdmin> adminDao=super.daoFactory.getDAOByClass(MainAdmin.class);
		BasicAccount adminAccount=new BasicAccount();
		adminAccount.setUserName(config.getUserName());
		adminAccount.setPassword(config.getPassword());
		MainAdmin admin=new MainAdmin();
		adminAccount.setAdmin(admin);
		adminDao.save(admin);
		userDao.save(adminAccount);
	}
	@Transactional
	public BasicAccount getUser(String userName){
		return userDao.getByID(userName);
	}
	@Transactional
	public void storeUser(UserRegistrationObject user){
		BasicAccount account= new BasicAccount();
		account.setUserName(user.getUserName());
		account.setPassword(user.getPassword());
		userDao.save(account);
	}
}
