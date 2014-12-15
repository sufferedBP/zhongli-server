package com.zhongli.server.XMVC.controller.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhongli.server.HTMLDynamic.HTMLServicImp;
import com.zhongli.server.XMVC.service.users.UserService;

@Controller
@RequestMapping("/init")
public class initController {
@Autowired
private UserService userService;
@Autowired
private HTMLServicImp service;
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String setAdmin(Model modle){
		userService.buildDefualt();
		service.initAdminDefualt();
		return null;
	}
	@RequestMapping(value="/customer",method=RequestMethod.GET)
	public String setCustomer(Model model){
		userService.buildDefualt();
		service.initCustomorDefualt();
		
		return null;
		
	}
}
