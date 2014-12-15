package com.zhongli.server.XMVC.controller.webpage.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhongli.server.XMVC.controller.Basic.HTMLDynamic.AOP.LoadHtmlAdminPageFramData;
@Controller
@RequestMapping("/webpage/admin/")
public class AdminController {
	
	@RequestMapping()
	@LoadHtmlAdminPageFramData
	public String initUserHTMLData(Model model,HttpServletRequest request){
		
		return "/page/admin/adminMain";
	}

}
