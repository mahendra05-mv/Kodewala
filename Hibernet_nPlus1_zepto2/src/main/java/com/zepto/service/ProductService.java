package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.CategoryEntity;
import com.zepto.entity.ProductEntity;
import com.zepto.repository.CategoryRepository;
import com.zepto.repository.ProductRepository;
import com.zepto.request.ProductRequest;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public int createProduct(ProductRequest request)
	{
		ProductEntity entity = new ProductEntity();
		
		entity.setProductName(request.getProductName());
		entity.setQuantity(request.getQuantity());
		entity.setPrice(request.getPrice());
		entity.setDescription(request.getDescription());
		
		CategoryEntity categoryEntity = categoryRepository.findByCategory(request.getCategory());
		
		if(categoryEntity == null)
		{
			categoryEntity = new CategoryEntity();
			categoryEntity.setCategory(request.getCategory());
			categoryEntity.setStatus("Active");
			
			categoryEntity = categoryRepository.save(categoryEntity);
		}
				
		entity.setCategory(categoryEntity);
		
		ProductEntity responseEntity = productRepository.save(entity);
		
		int productId = responseEntity.getProductId();
		
		if(productId > 0)
		{
			System.out.println("Product has been successfully added and product id is : " + productId);
		}
		else {
			System.out.println("Unable to add the product");
		}
		
		return productId;
	}
	
	public String searchProduct(String input)
	{
		ProductEntity entity = productRepository.findProductByProductName(input);
		String res = entity.getProductName() + " " + entity.getQuantity() + " " + entity.getDescription() + " " + entity.getPrice();
		return res;
	}
	
}
