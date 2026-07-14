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
	public String createProduct(@ModelAttribute ProductRequest request)
	{
		int productId = productService.createProduct(request);
		return "Product created and its id : " +productId;
	}
	
	@GetMapping("searchPage")
	public String showSearchPage()
	{
		return "search-product";
	}
	
	@PostMapping("search")
	@ResponseBody
	public String searchProduct(@RequestParam("name") String input)
	{
		String product = productService.searchProduct(input);
		return product;
	}
}
