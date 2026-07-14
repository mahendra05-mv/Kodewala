package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodewala.request.SignUpRequest;

@Controller
public class SignUpController {

	@PostMapping("singupPage")
	public String doSignUp(@ModelAttribute SignUpRequest request, Model model)
	{
		System.out.println(request.getFirstName());
		System.out.println(request.getLastName());
		System.out.println(request.getEmail());
		System.out.println(request.getMob());
		
		String usrId =
		        request.getFirstName().substring(0, 2).toUpperCase() +
		        request.getLastName().substring(0, 2).toUpperCase() +
		        request.getMob().substring(request.getMob().length() - 4) +
		        (int)(Math.random() * 1000);
		
		model.addAttribute("usrId", usrId);		//key value
		
		System.out.println(usrId);
		
		return "signup-sucess";
	}
}
