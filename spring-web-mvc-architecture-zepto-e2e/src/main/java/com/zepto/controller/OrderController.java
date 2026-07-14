package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;

//controller -> service -> repository

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zepto.repository.OrderRepository;
import com.zepto.request.OrderRequest;
import com.zepto.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
		@PostMapping("order")
	public String orderProducts(@ModelAttribute OrderRequest req)
	{
		System.out.println("OrderController.item : " +req.getItem());
		System.out.println("OrderController.qty : " +req.getQty());
		System.out.println("OrderController.price : " +req.getPrice());
		
		orderService.getOrderService(req);
		
		return "response-page";
	}
}

