package com.paytm.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {

	@GetMapping("viewProds")
	public String displayProducts()
	{
		System.out.println("SearchController.displayProducts().........");
		return "prod-search";
	}
	
	@GetMapping("searchProd")
	@ResponseBody
	public String searchProducts(@RequestParam("SearchText") String str1)
	{
		System.out.println(str1);
		return "Just a normal search result for " + str1 + " from Paytm XD!!!";
	}
}
