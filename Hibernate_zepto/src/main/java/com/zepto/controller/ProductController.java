package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.request.ProductRequest;
import com.zepto.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("createProduct")
	@ResponseBody
	public String uploadProduct(@ModelAttribute ProductRequest request)
	{
		long productId = productService.createProduct(request);
		return "product has been created and its id is " + productId;
	}
	
	@GetMapping("searchPage")
	public String showSearchPage()
	{
		return "search-page";
	}
	
	@PostMapping("searchProduct")
	@ResponseBody
	public String searchProduct(@RequestParam("seachProduct") String input)
	{
		String product = productService.searchProduct(input);
		return product;
	}
}
