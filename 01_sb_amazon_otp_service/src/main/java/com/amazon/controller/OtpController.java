package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.request.OtpRequest;
import com.amazon.response.OtpResponse;
import com.amazon.service.OtpService;

@RestController
@RequestMapping("otp")
public class OtpController {

	@Autowired
	OtpService otpService;
	
	@PostMapping("/generator")
	public OtpResponse generateOtp(@RequestBody OtpRequest otpRequest)
	{
		String name = otpRequest.getName();
		String mobile = otpRequest.getMobile();
		OtpResponse otpResponse = otpService.saveOtp(name, mobile);
		
		
		return otpResponse;
	}
	
	@PostMapping("/match/{mobile}/{otp}")
	public String validateOtp(@PathVariable("mobile") String mobile, @PathVariable("otp") Integer otp)
	{
		return otpService.validateOtp(mobile, otp);	
	}
}
