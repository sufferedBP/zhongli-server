package com.zhongli.server.HTMLDynamic;


import com.zhongli.server.basic.ApplicationContextProvider;

public class BasicHTMLStructure {
	protected HTMLInfo htmlInfo;
	public BasicHTMLStructure() {
		// TODO Auto-generated constructor stub
		htmlInfo=(HTMLInfo)ApplicationContextProvider.getContext().getBean("htmlInfo");
	}

}
