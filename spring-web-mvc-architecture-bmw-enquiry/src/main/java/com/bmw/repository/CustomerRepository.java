package com.bmw.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bmw.request.CustomerRequest;

//name	mob		email	city	state	budget

@Repository
public class CustomerRepository {

	public boolean cusRepo(@ModelAttribute CustomerRequest req)
	{
		System.out.println("\nCustomerRepository     START");
		System.out.println("CustomerRepository Name : " +req.getName());
		System.out.println("CustomerRepository Mobile : " +req.getMob());
		System.out.println("CustomerRepository Email : " +req.getEmail());
		System.out.println("CustomerRepository City : " +req.getCity());
		System.out.println("CustomerRepository State : " +req.getState());
		System.out.println("CustomerRepository Budget : " +req.getBudget());
		System.out.println("CustomerRepository END\n");
		
		return true;
	}
}
