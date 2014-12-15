// builder for default page 

package com.zhongli.server.HTMLDynamic.config;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zhongli.server.HTMLDynamic.HTMLFooterConvertor;
import com.zhongli.server.HTMLDynamic.HTMLMenuConvertor;
import com.zhongli.server.HTMLDynamic.HTMLMenuUnitConvertor;
import com.zhongli.server.HTMLDynamic.HTMLPageConvertor;
import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLComponent;
import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLMainPage;
import com.zhongli.server.XMVC.domain.HTMLDynamic.TextUnit;
import com.zhongli.server.basic.BasicServiceObject;
@Service
@EnableTransactionManagement
public class HTMLPageFactoryService  extends BasicServiceObject {
	
	// build default Main page Using default menu
	public HTMLMainPage buildDefualt(String name){
		HTMLPageConvertor defualtPage=new HTMLPageConvertor(name);
		defualtPage.setMenu(getDefualtMenu());
		defualtPage.setFooter(getDefualtFooter());
		defualtPage.setRightMenu(getRightDefualtMenu());
		TextUnit pageTitle=new TextUnit();
		pageTitle.setName("defualtPageTitle");
		pageTitle.setText_en("zhongli");
		defualtPage.setTitle(pageTitle);
		return defualtPage.getMainPage();
	}
	
	// build a default menu on the 
	private HTMLComponent getDefualtMenu(){
		HTMLMenuConvertor defualtMenu=new HTMLMenuConvertor("defualt_menu");
		defualtMenu.setTitle("defualtTitle", "zhongli", "众里");

		addDefualtMenuUnits(defualtMenu.getMenu());	
		return defualtMenu.getMenu();
	}
	private HTMLComponent getRightDefualtMenu(){
		HTMLMenuConvertor defualtMenu=new HTMLMenuConvertor("defualt_right_menu");
		addLastDefualtMenuUnits(defualtMenu.getMenu());
		return defualtMenu.getMenu();
	}
	private void addLastDefualtMenuUnits(HTMLComponent menu){
		HTMLMenuConvertor resualt=new HTMLMenuConvertor(menu.getName(),menu);
		HTMLMenuUnitConvertor menuUnit_log=new HTMLMenuUnitConvertor("defualt_sub_login");
		menuUnit_log.buildTitleText(null, "logIn","登录", "/webpage/login.html");
		HTMLMenuUnitConvertor menuUnit_apply=new HTMLMenuUnitConvertor("defualt_sub_apply");		
		menuUnit_apply.buildTitleText(null, "apply","申请", "/webpage/apply/userApplication.html");
		
		resualt.addMenuUnit(menuUnit_log.getUnit());
		resualt.addMenuUnit(menuUnit_apply.getUnit());		
	}
	private void addDefualtMenuUnits(HTMLComponent menu){
		HTMLMenuConvertor resualt=new HTMLMenuConvertor(menu.getName(),menu);
		HTMLMenuUnitConvertor menuUnit=new HTMLMenuUnitConvertor("defualt1");
		menuUnit.buildTitleText(null, "test",null, "/webpage/apply/userApplication.html");
		resualt.addMenuUnit(menuUnit.getUnit());
		
		TextUnit text_head=new TextUnit();
		text_head.setHerf("home");
		text_head.setText_en("test2");
		TextUnit text_sub=new TextUnit();
		text_sub.setHerf("#");
		text_sub.setText_en("test_sub");
		
		HTMLMenuUnitConvertor menuUnit2=new HTMLMenuUnitConvertor("defualt2");
		resualt.addMenuUnit(menuUnit2.getUnit());
		menuUnit2.setTitleText(text_head);
		menuUnit2.addUnit(text_sub);
	}
	private HTMLComponent getDefualtFooter(){
		HTMLFooterConvertor defualtFooter=new HTMLFooterConvertor("defualt");
		TextUnit element1=new TextUnit();
		element1.setName("copyRight");
		element1.setText_en("&copy; 2014 ZhongLi, Inc.");
		TextUnit element2=new TextUnit();
		element2.setName("aboutUs");
		element2.setText_en("About us");
		element2.setHerf("#");
		defualtFooter.addTextUnit(element1);
		defualtFooter.addTextUnit(element2);
		return defualtFooter.getFooter();
	}

	
}
