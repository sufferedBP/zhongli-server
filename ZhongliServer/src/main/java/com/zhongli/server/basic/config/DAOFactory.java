package com.zhongli.server.basic.config;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.zhongli.server.DAO.Hibernate.HibernateBasedDao;
import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLComponent;
import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLMainPage;
import com.zhongli.server.XMVC.domain.HTMLDynamic.TextUnit;
import com.zhongli.server.XMVC.domain.rent.resource.HouseINFO;
import com.zhongli.server.XMVC.domain.rent.resource.Items;
import com.zhongli.server.XMVC.domain.rent.resource.Room;
import com.zhongli.server.XMVC.domain.resource.ContectInfo;
import com.zhongli.server.XMVC.domain.resource.Image;
import com.zhongli.server.XMVC.domain.resource.LocalAddress;
import com.zhongli.server.XMVC.domain.users.BasicAccount;
import com.zhongli.server.XMVC.domain.users.Custommer;
import com.zhongli.server.XMVC.domain.users.LessingComp;
import com.zhongli.server.XMVC.domain.users.Lessor;
import com.zhongli.server.XMVC.domain.users.MainAdmin;
import com.zhongli.server.basic.DAO;
import com.zhongli.server.basic.DomainObject;
@Repository
@Scope( BeanDefinition.SCOPE_PROTOTYPE )
@SuppressWarnings("rawtypes")
public class DAOFactory {
	public static final String ORM_TYPE_HIBERNATE="hibernate";
	private static final Logger logger = LoggerFactory.getLogger(DAOFactory.class);
	@Autowired
	private ServerConfig serverConfig;
	@Autowired
	SessionFactory sessionFactory;

public <E extends DomainObject> DAO getDAOByClass(Class<E> clazz){
	String className=clazz.getName();
	logger.info("get request for Dao Access");
	logger.info("read Server config file ormType property:"+serverConfig.getOrmType());
	logger.info("get reques for hibernate DAO for class:"+className);
	if(serverConfig.getOrmType().equals(ORM_TYPE_HIBERNATE))
		return hibernateBasedDao(className);
	return null;
}
public DAO hibernateBasedDao(String className){
	// register classes to DAO here!!!
	logger.info("get reques for hibernate DAO for class:"+className);
	switch(className){
	
	// case of rent.resource package
	case "com.zhongli.server.XMVC.domain.rent.resource.HouseINFO":
		logger.info("Returning Dao forclass:"+className);
		HibernateBasedDao<HouseINFO> hHouseINFODao= new HibernateBasedDao<HouseINFO>(){};
		hHouseINFODao.setSessionFactory(sessionFactory);
		DAO<HouseINFO> daoHouseINFO=hHouseINFODao;
		return daoHouseINFO;
	case "com.zhongli.server.XMVC.domain.rent.resource.Items":
		logger.info("Returning Dao forclass:"+className);
		HibernateBasedDao<Items> hItemsDao= new HibernateBasedDao<Items>(){};
		hItemsDao.setSessionFactory(sessionFactory);
		DAO<Items> daoItems=hItemsDao;
		return daoItems;
	case "com.zhongli.server.XMVC.domain.rent.resource.Room":
		logger.info("Returning Dao forclass:"+className);
		HibernateBasedDao<Room> hRoomDao= new HibernateBasedDao<Room>(){};
		hRoomDao.setSessionFactory(sessionFactory);
		DAO<Room> daoRoom=hRoomDao;
		return daoRoom;
	
		
	 // case of Resource package
	case "com.zhongli.server.XMVC.domain.resource.LocalAddress":
		logger.info("Returning Dao forclass:"+className);
		HibernateBasedDao<LocalAddress> hAddressDao= new HibernateBasedDao<LocalAddress>(){};
		hAddressDao.setSessionFactory(sessionFactory);
		DAO<LocalAddress> dao=hAddressDao;
		return dao;
	case "com.zhongli.server.XMVC.domain.resource.Image":
		logger.info("Returning Dao forclass:"+className);
		HibernateBasedDao<Image> hImageDao= new HibernateBasedDao<Image>(){};
		hImageDao.setSessionFactory(sessionFactory);
		DAO<Image> daoImage=hImageDao;
		return daoImage;
	case "com.zhongli.server.XMVC.domain.resource.ContectInfo":
		logger.info("Returning Dao forclass:"+className);
		HibernateBasedDao<ContectInfo> hContectInfoDao= new HibernateBasedDao<ContectInfo>(){};
		hContectInfoDao.setSessionFactory(sessionFactory);
		DAO<ContectInfo> daoContectInfo=hContectInfoDao;
		return daoContectInfo;
	
		
	// case of HTMLDynamic package 
	case "com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLComponent":
		logger.info("Returning Dao forclass:"+className);
		HibernateBasedDao<HTMLComponent> hHcompDao= new HibernateBasedDao<HTMLComponent>(){};
		hHcompDao.setSessionFactory(sessionFactory);
		DAO<HTMLComponent> daoHComp=hHcompDao;
		return daoHComp;
	case "com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLMainPage":
		logger.info("Returning Dao forclass:"+className);
		HibernateBasedDao<HTMLMainPage> hHMPDao= new HibernateBasedDao<HTMLMainPage>(){};
		hHMPDao.setSessionFactory(sessionFactory);
		DAO<HTMLMainPage> daoHMP=hHMPDao;
		return daoHMP;
	case "com.zhongli.server.XMVC.domain.HTMLDynamic.TextUnit":
		logger.info("Returning Dao forclass:"+className);
		HibernateBasedDao<TextUnit> TextUnitDao= new HibernateBasedDao<TextUnit>(){};
		TextUnitDao.setSessionFactory(sessionFactory);
		DAO<TextUnit> daoTextUnit=TextUnitDao;
		return daoTextUnit;
	
	// case of User package
	case "com.zhongli.server.XMVC.domain.users.BasicAccount":
		HibernateBasedDao<BasicAccount> hBasicAccountDao= new HibernateBasedDao<BasicAccount>(){};
		hBasicAccountDao.setSessionFactory(sessionFactory);
		DAO<BasicAccount> daoBasicAccount=hBasicAccountDao;
		return daoBasicAccount;
	case "com.zhongli.server.XMVC.domain.users.Custommer":
		HibernateBasedDao<Custommer> hCustommerDao= new HibernateBasedDao<Custommer>(){};
		hCustommerDao.setSessionFactory(sessionFactory);
		DAO<Custommer> daoCustommer=hCustommerDao;
		return daoCustommer;
	case "com.zhongli.server.XMVC.domain.users.LessingComp":
		HibernateBasedDao<LessingComp> hLessingCompDao= new HibernateBasedDao<LessingComp>(){};
		hLessingCompDao.setSessionFactory(sessionFactory);
		DAO<LessingComp> daoLessingComp=hLessingCompDao;
		return daoLessingComp;
	case "com.zhongli.server.XMVC.domain.users.Lessor":
		HibernateBasedDao<Lessor> hLessorDao= new HibernateBasedDao<Lessor>(){};
		hLessorDao.setSessionFactory(sessionFactory);
		DAO<Lessor> daoLessor=hLessorDao;
		return daoLessor;
	case "com.zhongli.server.XMVC.domain.users.MainAdmin":
		HibernateBasedDao<MainAdmin> hMainAdminDao= new HibernateBasedDao<MainAdmin>(){};
		hMainAdminDao.setSessionFactory(sessionFactory);
		DAO<MainAdmin> daoMainAdmin=hMainAdminDao;
		return daoMainAdmin;
		
	}
	return null;
}
}
