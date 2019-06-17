package com.tts.ProjectMockingbird.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController 
{
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getIndexPage() 
	{	
		return "index";
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String getRegisterPage()
	{
		return "authentication/register";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLoginPage()
	{
		return "authentication/login";
	}
	
	
}
