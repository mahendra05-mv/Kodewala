package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.kodewala.Payment;

@Configuration
public class Config {

	@Bean("payment")
	@Scope("prototype")
	@Profile("dev")
	public Payment createPayment()
	{
		Payment pay = new Payment();
		pay.setPaymentId("PAYREF5678");
		return pay;
	}
}
