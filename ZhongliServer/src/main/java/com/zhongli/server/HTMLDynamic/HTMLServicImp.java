package com.zhongli.server.HTMLDynamic;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.zhongli.server.HTMLDynamic.config.HTMLPageFactoryService;
import com.zhongli.server.XMVC.domain.HTMLDynamic.GlobalStyle;
import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLMainPage;
import com.zhongli.server.basic.BasicServiceObject;
import com.zhongli.server.basic.DAO;
import com.zhongli.server.basic.config.ServerConfig;

@Service
@EnableTransactionManagement
public class HTMLServicImp extends BasicServiceObject{
	@Autowired
	private ServerConfig serverConfig;
	private HTMLMainPage customorHTMLData;
	private HTMLMainPage adminHTMLData;
	
	@Autowired
	private GlobalStyle style;
	private DAO<HTMLMainPage> htmlMPDao;
	private static final Logger logger = LoggerFactory.getLogger(HTMLServicImp.class);

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init(){
		logger.info("init DAOs");
		htmlMPDao=super.daoFactory.getDAOByClass(HTMLMainPage.class);
	}
	@Transactional
	public void initCustomorDefualt(){
		HTMLMainPage defualt=htmlMPDao.getByID("defualt_customor");
		if(defualt==null){
			HTMLPageFactoryService builder=new HTMLPageFactoryService();
			defualt=builder.buildDefualt("defualt_customor");
			htmlMPDao.save(defualt);
		}
		updateCustomorHTMLPageByName("defualt_customor");
	}
	@Transactional
	public void initAdminDefualt(){
		HTMLMainPage defualt=htmlMPDao.getByID("defualt_admin");
		if(defualt==null){
			HTMLPageFactoryService builder=new HTMLPageFactoryService();
			defualt=builder.buildDefualt("defualt_admin");
			htmlMPDao.save(defualt);
		}
		updateAdminHTMLPageByName("defualt_admin");
	}
	@Transactional
	public void updateCustomorHTMLPageByName(String name){
		customorHTMLData=htmlMPDao.getByID(name);
	}
	@Transactional
	public void updateAdminHTMLPageByName(String name){
		adminHTMLData=htmlMPDao.getByID(name);
	}
	
	public HTMLMainPage getCustomorHTMLData(){
		customorHTMLData.setGlobalStyle(style);
		return customorHTMLData;
	}
	public HTMLMainPage getAdminHTMLData() {
		customorHTMLData.setGlobalStyle(style);
		return adminHTMLData;
	}
	
}
