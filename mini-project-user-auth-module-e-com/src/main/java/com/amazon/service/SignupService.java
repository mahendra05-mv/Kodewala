package com.amazon.service;

import java.util.ArrayList;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.amazon.repository.SignupRepository;
import com.amazon.request.Users;

@Service
public class SignupService {

	@Autowired
	SignupRepository signupRepo = new SignupRepository();
	
	public String doSignUp(Users user)
	{
		if(user.getConfirmPassword().equals(user.getPassword()))
		{
			signupRepo.save(user);
			return "successful-signup";
		}
		
		return "unsuccessful-signup";			
	}
}
