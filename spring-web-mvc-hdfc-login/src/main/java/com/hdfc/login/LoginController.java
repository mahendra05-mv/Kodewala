package com.hdfc.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/doLogin")
	public String login()
	{
		System.out.println("LoginController.login() for HDFC");
		return "hdfc-login-page";
	}
}
