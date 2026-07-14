package com.bmw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bmw.request.CustomerRequest;
import com.bmw.service.CustomerService;

//name	mob		email	city	state	budget

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService cusServ;

	@PostMapping("enquiry")
	public String customerController(@ModelAttribute CustomerRequest req)
	{
		System.out.println("CustomerController   START");
		
		cusServ.cusSer(req);
		
		System.out.println("CustomerController   END");
		return "homepage";
	}
}
