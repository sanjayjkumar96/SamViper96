package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.Account;
import com.cg.service.IWalletBasicService;

@Controller
public class HelloController {

	@Autowired
	IWalletBasicService service;
	
@RequestMapping("/")	
	public String showIndex()
	{
	
	return "index";
	}
	
@RequestMapping("/show")
public ModelAndView showShowPage()
{
	String msg = "Welcome to 1st page";
	return new ModelAndView("show","msg",msg);
}
@RequestMapping("/findById")
public ModelAndView findById()
{
	Account a = service.checkLogin(847);
	
	return new ModelAndView("FindPage","user",a);
}
}
