package com.e2e.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e2e.entity.Entity;
import com.e2e.repository.E2eRepository;

@Service
public class E2eServiceQA {

	@Autowired
	E2eRepository repository;
	
	public String createProduct(String name, int price)
	{
		Entity entity = new Entity();
		
		entity.setName(name);
		entity.setPrice(price);
		repository.save(entity);
		
		return "Product created";
	}
	
	
}
