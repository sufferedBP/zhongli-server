package com.zhongli.server.XMVC.controller.webpage.apply;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhongli.server.XMVC.controller.Basic.HTMLDynamic.AOP.LoadHtmlCustomorFramData;
import com.zhongli.server.XMVC.domain.utl.UserRegistrationObject;
import com.zhongli.server.XMVC.service.users.UserService;
import com.zhongli.server.XMVC.service.utl.Validator;

@Controller
@RequestMapping("/webpage/apply")
public class ApplicationController {
	private final Logger logger=LoggerFactory.getLogger(ApplicationController.class); 
	@Autowired
	private Validator validator;
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public UserRegistrationObject getUser(){
		return new UserRegistrationObject();
	}
	
	@RequestMapping(value="/userApplication.html",method=RequestMethod.GET)
	@LoadHtmlCustomorFramData
	public String returnTest(Model model,HttpServletRequest request){
		return "/page/customor/UserApplication";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	@LoadHtmlCustomorFramData
	 public String processRegistration(Model model,HttpServletRequest request,@ModelAttribute("user") @Valid UserRegistrationObject user,
             BindingResult result) {
			validator.validateUser(user, result);
			if(result.hasErrors()){
				return "/page/customor/UserApplication";
			}
			userService.storeUser(user);
			return "/page/test";
	}
	
	
	
}
