package com.zhongli.server.XMVC.controller.Basic.HTMLDynamic.AOP;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.zhongli.server.HTMLDynamic.HTMLServicImp;


public class HtmlFramDataLoader {
	// @annotaion(com.zhongli.server.controller.webpageAOP.LoadHtmlFramData)
	private final Logger logger = LoggerFactory
			.getLogger(HtmlFramDataLoader.class);
	@Autowired
	private HTMLServicImp service;

	public HtmlFramDataLoader() {
	}

	@Before("@annotation(com.zhongli.server.controller.webpageAOP.LoadHtmlAdminPageFramData)&&args(model,request,..)")
	public void loadAdminData(Model model, HttpServletRequest request) {
		model.addAttribute("orgRequest", request.getServletPath());
		model.addAttribute("pageData", service.getAdminHTMLData());

	}

	@Before("@annotation(com.zhongli.server.controller.webpageAOP.LoadHtmlCustomorFramData)&&args(model,request,..)")
	public void loadCustomorData(Model model, HttpServletRequest request) {
		model.addAttribute("orgRequest", request.getServletPath());
		model.addAttribute("pageData", service.getCustomorHTMLData());

	}
}
