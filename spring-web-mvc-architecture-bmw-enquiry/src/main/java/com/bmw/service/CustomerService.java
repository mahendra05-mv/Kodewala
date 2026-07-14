package com.bmw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bmw.repository.CustomerRepository;
import com.bmw.request.CustomerRequest;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository cusRepo;
	
	public boolean cusSer(@ModelAttribute CustomerRequest req)
	{
		System.out.println("\nCustomerService   START");
		
		cusRepo.cusRepo(req);
		
		System.out.println("CustomerService END\n");
		
		return true;
	}
}
