package com.kodewala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	
	@Bean("payment")
//	@Scope("prototype")
	public Payment createPayment()
	{
		Payment pay = new Payment();
		pay.setPaymentId("PAYREF1234");
		return pay;
	}
}
