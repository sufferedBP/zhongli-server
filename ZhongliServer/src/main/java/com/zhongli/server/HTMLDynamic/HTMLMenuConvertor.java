package com.zhongli.server.HTMLDynamic;

import java.util.ArrayList;
import java.util.List;

import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLComponent;
import com.zhongli.server.XMVC.domain.HTMLDynamic.TextUnit;
import com.zhongli.server.XMVC.domain.resource.Image;

public class HTMLMenuConvertor extends BasicHTMLStructure  {
	private HTMLComponent menu;

	public HTMLMenuConvertor(String name,HTMLComponent toConvert){
		if(toConvert==null)
			toConvert= new HTMLComponent();
		this.menu=toConvert;
		if(menu.getTextUnits()==null)
			menu.setTextUnits(new ArrayList<TextUnit>());
		if(menu.getComponents()==null)
			menu.setComponents(new ArrayList<HTMLComponent>());
		if(menu.getTextUnits().size()==0)
			menu.getTextUnits().add(null);
		menu.setType(htmlInfo.getMenuMark());
		menu.setName(name);
	}
	public HTMLMenuConvertor( String name){
		this(name,null);
	}
	
	public void setBackGruand(Image imag){
		menu.setBackGraound(imag);
	}
	public void setTitle(String name, String enText, String cnText){
		TextUnitConvertor unit=new TextUnitConvertor(null);
		unit.setUnit(name, enText, cnText, null);
		setTitle(unit.getUnit());
	}
	public void setTitle(TextUnit title){
		title.setType(htmlInfo.getMenuMark()+htmlInfo.getJointMark()+htmlInfo.getTitleExtentionMark());
		menu.getTextUnits().set(0, title);
	}
	public void addMenuUnit(HTMLComponent item){
		menu.getComponents().add(item);
	}
	public List<HTMLComponent> getMenuUnits(){
		return menu.getComponents();
	}
	public HTMLComponent getMenu(){
		return this.menu;
	}
}
