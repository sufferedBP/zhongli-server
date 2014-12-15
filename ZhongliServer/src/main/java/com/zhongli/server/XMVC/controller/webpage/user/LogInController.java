package com.zhongli.server.XMVC.controller.webpage.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhongli.server.XMVC.controller.Basic.HTMLDynamic.AOP.LoadHtmlCustomorFramData;

@Controller
@RequestMapping("/webpage")
public class LogInController {
	@RequestMapping("/login.html")
	@LoadHtmlCustomorFramData
	public String getLoginPage(Model model,HttpServletRequest request){
		return "/page/customor/Login";
	}

}
