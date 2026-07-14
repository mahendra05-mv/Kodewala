package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amazon.request.Users;
import com.amazon.service.LoginService;
import com.amazon.service.ResetPassword;

@Controller
public class LoginController {
	
	@Autowired
	LoginService logSer;
	
	@Autowired
	ResetPassword resPass;

	@PostMapping("doLogin")
	public String doLogin(@RequestParam("loginEmail") String email, @RequestParam("loginPassword") String pass)
	{
		return logSer.doLogin(email, pass);
	}
	
	@PostMapping("resetPassword")
	public String resetPass(@RequestParam("email") String email, @RequestParam("password") String pass, @RequestParam("newPassword") String newPass)
	{
		return resPass.doResetPass(email, pass, newPass);
	}
}
