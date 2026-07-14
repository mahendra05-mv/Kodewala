 package com.amazon.service;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.Entity;
import com.amazon.repository.OtpRepository;
import com.amazon.response.OtpResponse;

@Service
public class OtpService {

	@Autowired
	OtpRepository otpRepository;
	
	public String generateOtp()
	{
		SecureRandom random = new SecureRandom();
		int otp = 100000 + random.nextInt(900000); // Generates 100000 to 999999
		System.out.println(" Generated OTP :::: " + otp);
		return String.valueOf(otp);
	}
	
	public OtpResponse saveOtp(String name, String mobile)
	{
		Entity entity = new Entity();
		
		entity.setName(name);
		entity.setMobile(mobile);
		entity.setOtp(generateOtp());
		entity.setStatus("Active");
		
		Entity resp = otpRepository.save(entity);
		if(resp.getId() > 0)
		{
			System.out.println("Otp saved successfully");
		}
		else {
			System.out.println("Unable to process, please try again");
		}
		
		OtpResponse otpResponse = new OtpResponse();
		
		otpResponse.setOtp(resp.getOtp());
		otpResponse.setStatus(resp.getStatus());
		otpResponse.setValid("for 5 mins");
		
		return otpResponse;
	}
	
	public String validateOtp(String mobile, int otp)
	{
		Entity validateOtp = otpRepository.findByMobile(mobile);
		
		if(validateOtp == null)
			return "Unable to process, please try again";
		int respOtp = Integer.parseInt(validateOtp.getOtp());
		
		if(respOtp == otp)
			return "Congratulations, you have entered correct OTP XD!!!";
		
		return "Unable to process, please try again";
	}
	
}
