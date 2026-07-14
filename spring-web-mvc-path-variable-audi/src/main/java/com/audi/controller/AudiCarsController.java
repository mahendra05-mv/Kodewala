package com.audi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AudiCarsController {

	@GetMapping("cars/{series}/{model}")
	@ResponseBody
	public String displayCars(@PathVariable("series") String series, @PathVariable("model") int model)
	{
		System.out.println("Series : " +series);
		System.out.println("Model : " +model);
		System.out.println("Full car name : Audi " +series+model);
		return series + model;
	}
}
