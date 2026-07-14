package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.entity.ProdEntity;
import com.amazon.request.ProdRequest;
import com.amazon.service.ProdService;

@RestController
public class ProdController {

	@Autowired
	ProdService prodService;
	
	@PostMapping("/add")
	public String addProduct(@RequestBody ProdRequest request)
	{
		return prodService.createProduct(request.getName(), request.getPrice(), request.getDesc());
	}
	
//	@PostMapping("/search")
//	@ResponseBody
//	public String searchProduct(String name)
//	{
//		return prodService.searchProduct(name);
//	}
//	
//	@PostMapping("/changePrice")
//	@ResponseBody
//	public String changePrice(String name, String price)
//	{
//		return prodService.changeProductPrice(name, price);
//	}
//	
//	@PostMapping("/removeProduct")
//	@ResponseBody
//	public String removeProduct(String name)
//	{
//		return prodService.removeProduct(name);
//	}
//	
//	@GetMapping("/displayAll")
//	@ResponseBody
//	public String displayAllProducts()
//	{
//		return prodService.displayAllProducts();
//	}
	
}
