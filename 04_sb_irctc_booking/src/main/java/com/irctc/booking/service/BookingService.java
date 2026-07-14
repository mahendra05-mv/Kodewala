package com.irctc.booking.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.booking.entity.BookingEntity;
import com.irctc.booking.repository.BookingRepository;
import com.irctc.booking.request.BookingRequest;
import com.irctc.booking.response.BookingResponse;

import jakarta.persistence.PrePersist;

@Service
public class BookingService {

	@Autowired
	BookingRepository repository;
	
	private long pnr;

	@PrePersist
	public long generatePnr() {
	    if (this.pnr == 0) {
	        this.pnr = ThreadLocalRandom.current()
	                .nextLong(1000000000L, 10000000000L); // 10 digit PNR
	    }
	    return this.pnr;
	}
	
	public BookingResponse createBooking(BookingRequest request)
	{
		BookingEntity entity = new BookingEntity();
		
		entity.setName(request.getName());
		entity.setSource(request.getSource());
		entity.setDestination(request.getDestination());
		entity.setPnr(generatePnr());
		entity.setStatus("Pending");
		repository.save(entity);
		
		BookingResponse resp = new BookingResponse();
		
		resp.setBookingId(entity.getBookingId());
		resp.setCoachNo("Second AC");
		resp.setPnr(entity.getPnr());
		resp.setSeatNo("B24");
		resp.setStatus(entity.getStatus());
		
		return resp;
	}
}
