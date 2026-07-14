package com.irctc.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.irctc.booking.entity.BookingEntity;
import com.irctc.booking.repository.BookingRepository;
import com.irctc.booking.response.BookingResponse;

@Service
@Profile("QA")
public class BookingServiceQA {

	@Autowired
	BookingRepository repository;
	
	public BookingEntity confirmStatus(long pnr)
	{
		BookingEntity resp = repository.findByPnr(pnr);
		resp.setStatus("Confirmed");

		return repository.save(resp);
	}
	
	public BookingResponse displayDetails(long pnr)
	{
		BookingEntity entity = repository.findByPnr(pnr);
		BookingResponse resp = new BookingResponse();
		resp.setPnr(entity.getPnr());
		resp.setStatus(entity.getStatus());
		resp.setCoachNo("B12");
		
		
		return resp;
	}
}
