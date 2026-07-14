package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderDetailController {

	@GetMapping("/orderDetails/{orderId}/{itemName}")
	@ResponseBody
	public String getDetails(@PathVariable("orderId") String orderId, @PathVariable("itemName") String itemName)
	{
		System.out.println("Order id is : " +orderId);
		System.out.println("Item name is : " +itemName);
		return orderId + " " + itemName;
	}
}
