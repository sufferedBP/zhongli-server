package com.zhongli.server.HTMLDynamic;

import java.util.ArrayList;
import java.util.List;

import com.zhongli.server.XMVC.domain.HTMLDynamic.HTMLComponent;
import com.zhongli.server.XMVC.domain.HTMLDynamic.TextUnit;

public class HTMLMenuUnitConvertor extends BasicHTMLStructure  {
private HTMLComponent toConvert;

public HTMLMenuUnitConvertor(String name,HTMLComponent toConvert){
	if(toConvert ==null)
		toConvert=new HTMLComponent();
	if(toConvert.getTextUnits()==null)
		toConvert.setTextUnits(new ArrayList<TextUnit>());
	if(toConvert.getTextUnits().size()==0)
		toConvert.getTextUnits().add(null);
	toConvert.setType(htmlInfo.getMenuUnitMark());
	toConvert.setName(name);
	this.toConvert=toConvert;
}
public HTMLMenuUnitConvertor(String name){
	this(name,null);
}
public void buildTitleText(String name,String text_en,String text_cn,String herf){
	TextUnitConvertor unitConvertor= new TextUnitConvertor(name,text_en,text_cn,herf);
	setTitleText(unitConvertor.getUnit());
}
public void setTitleText(TextUnit title){
	title.setType(htmlInfo.getMenuUnitMark()+htmlInfo.getJointMark()+htmlInfo.getTitleExtentionMark());
	toConvert.getTextUnits().set(0, title);
}
public TextUnit getTitleText(){
	return toConvert.getTextUnits().get(0);
}
public void addUnit(TextUnit unit){
	unit.setType(htmlInfo.getMenuUnitMark()+htmlInfo.getJointMark()+htmlInfo.getTextElementMark());
	toConvert.getTextUnits().add(unit);
}
public List<TextUnit> getUnits(){
	List<TextUnit> resualt= new ArrayList<TextUnit>();
	for(int i=1;i<toConvert.getTextUnits().size();i++)
		resualt.add(toConvert.getTextUnits().get(i));
	return resualt;
}
public HTMLComponent getUnit(){
	return toConvert;
}
}
