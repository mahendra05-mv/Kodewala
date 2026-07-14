package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.repository.OrderRepository;
import com.zepto.request.OrderRequest;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	public String getOrderService(OrderRequest req)
	{
		System.out.println("OrderService START");
		System.out.println("OrderService item : " +req.getItem());
		System.out.println("OrderService qty : " +req.getQty());
		System.out.println("OrderService price :" +req.getPrice());

		orderRepository.getOrderRepository(req);
		System.out.println("OrderService END");
		return "usr123";
	}
}
