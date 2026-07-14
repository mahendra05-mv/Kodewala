package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazon.repository.SignupRepository;
import com.amazon.request.Users;
import com.amazon.service.SignupService;

@Controller
public class SignupController {

	@Autowired
	SignupService signupService;
	
	@PostMapping("signup")
	public String signUp(@ModelAttribute Users user)
	{
		return signupService.doSignUp(user);
	}
	
}
