package com.myntra.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {

	@GetMapping("viewProds")
	public String displayProds()
	{
		System.out.println("SearchController.displayProds()........");
		return "view-prod-page";
	}
	
	@GetMapping("searchProds")
	@ResponseBody
	public String searchProds(@RequestParam("text1") String s1)
	{
		System.out.println(s1);
		return "The product which you searched on myntra is " +s1 + " "+s1 + " "+s1 + " "+s1 + " "+s1;
	}
}
