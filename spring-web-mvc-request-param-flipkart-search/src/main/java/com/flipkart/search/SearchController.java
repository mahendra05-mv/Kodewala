package com.flipkart.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {

	@GetMapping("viewProdPage")
	public String displayProducts()
	{
		System.out.println("SearchController.displayProducts()........");
		return "product-search";
	}
	
	@GetMapping("searchProdPage")
	@ResponseBody
	public String searchProds(@RequestParam("SearchText") String inputString)
	{
		System.out.println(inputString);
		return "flipkart sometimes sells copy as an authentic product(s)";
	}
}
