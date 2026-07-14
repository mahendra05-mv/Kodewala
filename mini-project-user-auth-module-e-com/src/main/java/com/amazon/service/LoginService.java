package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.repository.SignupRepository;

@Service
public class LoginService {

	@Autowired
	SignupRepository signupRepo;
	
	public String doLogin(String email, String pass)
	{
		if(signupRepo.doLoginRepo(email, pass))
		{
			return "login-successful";			
		}
		return "login-unsuccessful";
	}
}

//	