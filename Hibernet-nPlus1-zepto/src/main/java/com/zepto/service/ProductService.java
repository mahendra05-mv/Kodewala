package com.zepto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.CategoryEntity;
import com.zepto.entity.ProductEntity;
import com.zepto.repository.CategoryRepository;
import com.zepto.repository.ProductRepository;
import com.zepto.request.ProductRequest;

import jakarta.persistence.Entity;

@Service
public class ProductService {
	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ProductRepository productRepository;

	public void getCategories() {
		Iterable<CategoryEntity> categoryEntites = categoryRepository.findAll(); // one query
		
		System.out.println("\n\nI am loading category...\n\\n");
		
		for (CategoryEntity categoryEntity : categoryEntites) {
			System.out.println(
					"Name: " + categoryEntity.getCategory() + ", category id: " + categoryEntity.getCategory_id());
		List<ProductEntity> products	=categoryEntity.getProduct(); // find the query to get product(2) bcz we have 2 categories
		
		
		for(ProductEntity product : products) {
			System.out.println("productId"+product.getProductId() +"Product Name: "+product.getProductName());
			System.out.println("\n I am done loading categories, now going for products \n");
		}
		}
	}

	public int createProduct(ProductRequest productRequest) {
		String category = productRequest.getCategory();
		CategoryEntity categoryEntity = categoryRepository.findByCategory(category);

		ProductEntity productEntity = new ProductEntity(); // new

		productEntity.setProductName(productRequest.getProductName());
		productEntity.setDescription(productRequest.getDescription());
		productEntity.setPrice(productRequest.getPrice());
		productEntity.setQuantity(productRequest.getQuantity());
		productEntity.setCategory(categoryEntity);

		// this will create a record in table

		ProductEntity responseEntity = productRepository.save(productEntity);

//	int  productId = responseEntity.getProductId();
//
//		if (productId > 0) {
//			System.out.println("product has been created and product id is:" + productId);
//		} else {
//			System.out.println("unable to create product");
//		}
		return responseEntity.getProductId();

	}

}