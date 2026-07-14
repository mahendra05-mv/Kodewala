package com.amazon.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {

	@GetMapping("viewProdPage")
	public String displayProdPage()
	{
		System.out.println("SearchController.displayProdPage()..........");
		return "prod-search";
	}
	
	@GetMapping("searchProd")
	@ResponseBody
	public String searchProduct(@RequestParam("SearchText") String inputStr)
	{
		System.out.println(inputStr);
		return "some random iphone details here";
	}
}
