package com.zhongli.server.HTMLDynamic;

import com.zhongli.server.XMVC.domain.HTMLDynamic.TextUnit;

public class TextUnitConvertor extends BasicHTMLStructure {
	private TextUnit unit;
	public TextUnitConvertor(TextUnit unit){
		if(unit==null)
			unit=new TextUnit();
		this.unit=unit;
	}
	public TextUnitConvertor(String name, String text_en,String text_cn,String herf) {
		this(null);
		setUnit(name,text_en,text_cn,herf);
	}
	public void setUnit(String name, String text_en,String text_cn,String herf){
		if(herf!=null)
			unit.setHerf(herf);
		if(text_en!=null)
			unit.setText_cn(text_cn);
		if(text_cn!=null)
			unit.setText_en(text_en);
		if(name!=null)
			unit.setName(name);
		
	}
	public TextUnit getUnit(){
		return unit;
	}

}
