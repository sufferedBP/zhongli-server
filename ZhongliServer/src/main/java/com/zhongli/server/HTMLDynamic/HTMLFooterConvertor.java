package com.zhongli.server.HTMLDynamic;

import java.util.ArrayList;
import java.util.List;

import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLComponent;
import com.zhongli.server.XMVC.domain.HTMLDynamic.TextUnit;

public class HTMLFooterConvertor extends BasicHTMLStructure {

	private HTMLComponent toConvert;
	
	public HTMLFooterConvertor(String name,HTMLComponent toConvert){
		if(toConvert==null)
			toConvert=new HTMLComponent();
		toConvert.setType(htmlInfo.getFooterMark());
		if(toConvert.getTextUnits()==null)
			toConvert.setTextUnits(new ArrayList<TextUnit>());
		toConvert.setName(name);
		this.toConvert=toConvert;
		
	}
	public HTMLFooterConvertor(String name){
		this(name,null);
	}
	public void addTextUnit(TextUnit unit){
		unit.setType(htmlInfo.getFooterMark()+htmlInfo.getJointMark()+htmlInfo.getTextElementMark());
		this.toConvert.getTextUnits().add(unit);
	}
	public List<TextUnit> getTextUnits(){
		return toConvert.getTextUnits();
	}
	public HTMLComponent getFooter(){
		return toConvert;
	}
	
}
