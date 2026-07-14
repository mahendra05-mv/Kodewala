package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.repository.SignupRepository;

@Service
public class ResetPassword {

	@Autowired
	SignupRepository signupRepo;
	
	public String doResetPass(String email, String Pass, String newPass)
	{
		if(signupRepo.doResetPass(email, Pass, newPass))
		{
			return "password-reset-successfully";
		}
		return "password-reset-unsuccessful";
	}
}
