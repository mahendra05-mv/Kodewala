package com.bmw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {

	@GetMapping("bmwCarsPage/{carSeries}/{carModel}")
	@ResponseBody
	public String viewCars(@PathVariable("carSeries") String series, @PathVariable("carModel") String model)
	{
		System.out.println("CarController.viewCars() w/ car series and model :" +series + " " +model);
		return series + " " + model;
	}
}
