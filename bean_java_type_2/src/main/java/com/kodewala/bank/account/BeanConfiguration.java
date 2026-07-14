package com.kodewala.bank.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean("savings")
	public Account acc1()
	{
		Account a = new Account();
		a.setAccountNumber("34361530450");
		a.setHolderName("Mahendra Vishnoi");
		a.setBalance(15134);
		return a;
	}
	
	@Bean("current")
	public Account acc2()
	{
		Account acc = new Account();
		acc.setAccountNumber("29482849673");
		acc.setBalance(2385874);
		acc.setHolderName("Amit");
		return acc;
	}
}
