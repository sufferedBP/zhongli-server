package com.zhongli.server.XMVC.controller.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhongli.server.XMVC.controller.Basic.HTMLDynamic.AOP.LoadHtmlCustomorFramData;

@Controller
@RequestMapping("/webpage/test")
public class upLoad {
	
	@RequestMapping(value="/upload.html",method=RequestMethod.GET)
	@LoadHtmlCustomorFramData
	public String getPage(Model model,HttpServletRequest request){
		return "/page/customor/upLoad";
	}
}
