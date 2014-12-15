package com.zhongli.server.HTMLDynamic;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLComponent;
import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLMainPage;
import com.zhongli.server.XMVC.domain.HTMLDynamic.TextUnit;

public class HTMLPageConvertor extends BasicHTMLStructure  {
private static final Logger logger=LoggerFactory.getLogger(HTMLPageConvertor.class);
	private HTMLMainPage toConvert;
	public HTMLPageConvertor(String name,HTMLMainPage toConvert){
		if(toConvert==null){
			logger.debug("init page: "+name);
			toConvert=new HTMLMainPage();
		}
		this.toConvert=toConvert;
		if(this.toConvert.getComponents()==null){
			logger.debug("init page Component");
			this.toConvert.setComponents(new ArrayList<HTMLComponent>());
		}
		if(this.toConvert.getComponents().size()<3){
			while(this.toConvert.getComponents().size()<3)
				this.toConvert.getComponents().add(null);
		}
		logger.debug("set component size: "+this.toConvert.getComponents().size());
		this.toConvert.setName(name);
	}
	public HTMLPageConvertor(String name){
		this(name,null);
	}
	public void setTitle(TextUnit title){
		title.setType(htmlInfo.getPageMark()+htmlInfo.getJointMark()+htmlInfo.getTitleExtentionMark());
		this.toConvert.setHeadTag(title);
	}
	public TextUnit getTitle(){
		return toConvert.getHeadTag();
	}
	public void setMenu(HTMLComponent menu){
		this.toConvert.getComponents().set(0, menu);
	}
	public HTMLMenuConvertor getMenu(){
		HTMLComponent menu= toConvert.getComponents().get(0);
		HTMLMenuConvertor rMenu=new HTMLMenuConvertor(menu.getName(), menu);
		return rMenu;
	}
	public void setRightMenu(HTMLComponent menu){
		this.toConvert.getComponents().set(2, menu);
	}
	public HTMLMenuConvertor getRightMenu(){
		HTMLComponent menu= toConvert.getComponents().get(2);
		HTMLMenuConvertor rMenu=new HTMLMenuConvertor(menu.getName(), menu);
		return rMenu;
		
	}
	public void setFooter(HTMLComponent footer){
		this.toConvert.getComponents().set(1, footer);
	}
	public HTMLFooterConvertor getFooter(){
		HTMLComponent footer= toConvert.getComponents().get(1);
		HTMLFooterConvertor rFooter=new HTMLFooterConvertor(footer.getName(),footer);
		return rFooter;
	}
	public HTMLMainPage getMainPage(){
		return toConvert;
	}
}
