package com.kodewala;

//Spring 6 style
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Payment {

	private String paymentId;
	
	public Payment()
	{
		System.out.println("1. Bean Instantiated");
	}
	
	public String getPaymentId()
	{
		return paymentId;
	}
	
	public void setPaymentId(String _paymentId)
	{
		this.paymentId = _paymentId;
		System.out.println("2. Dependency Injected");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("3. Bean Initialized");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("4. Bean Destroyed");
	}
	
}
