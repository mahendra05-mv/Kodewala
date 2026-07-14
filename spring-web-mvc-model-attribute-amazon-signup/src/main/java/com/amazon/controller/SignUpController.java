package com.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazon.request.SignupRequest;

@Controller
public class SignUpController {

	@PostMapping("signUp")
	public String doSignUp(@ModelAttribute SignupRequest request, Model model) {
		String userId = request.getFirstName().substring(0, 2).toUpperCase()
				+ request.getLastName().substring(0, 2).toUpperCase() + request.getEmail().substring(0, 3).toUpperCase()
				+ request.getMob().substring(request.getMob().length() - 4) + (int) (Math.random() * 1000);

		model.addAttribute("userId", userId);
		return "homepage";
	}
}
