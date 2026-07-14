package com.irctc.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.booking.request.BookingRequest;
import com.irctc.booking.response.BookingResponse;
import com.irctc.booking.service.BookingService;
import com.irctc.booking.service.BookingServiceQA;

@RestController
@RequestMapping("irctc")
public class BookingController {

	@Autowired
	BookingService service;

	@PostMapping("/bookTicket")
	public BookingResponse bookTicket(@RequestBody BookingRequest request) {
		return service.createBooking(request);
	}

}
