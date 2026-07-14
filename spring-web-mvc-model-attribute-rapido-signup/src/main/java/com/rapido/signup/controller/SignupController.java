package com.rapido.signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rapido.request.SignupRequest;

@Controller
public class SignupController {

	@PostMapping("signup")
	public String doSignup(@ModelAttribute SignupRequest req, Model model)
	{
		String userId =
		        req.getFirstName().substring(0, 2).toUpperCase()
		        + req.getLastName().substring(0, 2).toUpperCase()
		        + req.getSource().substring(0, 2).toUpperCase()
		        + req.getDestination().substring(0, 2).toUpperCase()
		        + req.getMob().substring(req.getMob().length() - 4)
		        + Math.abs(req.getEmail().hashCode() % 1000);
		
		model.addAttribute("userId", userId);
		
		return "homepage";
	}
}
