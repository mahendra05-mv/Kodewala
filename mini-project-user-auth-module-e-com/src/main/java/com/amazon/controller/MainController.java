package com.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("go-to-login-page")
	public String goToLoginPage()
	{
		return "login-page";
		
	}
	
	@GetMapping("go-to-signup-page")
	public String goToSignupPage()
	{
		return "signup";
	}
	
	
}


/*






*/