package com.wipro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	
	@RequestMapping("/Login")  
	public String showLogin()  
	{
		return "LoginPage";   
	}

	
	
	@RequestMapping("/Welcome")  
	public ModelAndView showProfile()   
	{
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Profile");   
		mv.addObject("username", "Smita");  
		
		return mv;   
	}
}