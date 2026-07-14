package com.zepto.repository;

import org.springframework.stereotype.Repository;

import com.zepto.request.OrderRequest;

@Repository
public class OrderRepository {

	public boolean getOrderRepository(OrderRequest req)
	{
		System.out.println("OrderRepository START");
		System.out.println("OrderRepository item : " +req.getItem());
		System.out.println("OrderRepository qty : " +req.getQty());
		System.out.println("OrderRepository price : " +req.getPrice());
		System.out.println("OrderRepository END");
		
		return true;
	}
}
