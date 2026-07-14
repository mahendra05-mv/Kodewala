package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.CategoryEntity;
import com.zepto.entity.ProductEntity;
import com.zepto.repository.ProductRepository;
import com.zepto.request.ProductRequest;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public long createProduct(ProductRequest productRequest) {
		ProductEntity entity = new ProductEntity();

		entity.setProductName(productRequest.getProductName());
		entity.setPrice(productRequest.getPrice());
		entity.setQuantity(productRequest.getQuantity());
		entity.setDescription(productRequest.getDescription());

		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCategory(productRequest.getCategory());
		categoryEntity.setStatus("Active");

		entity.setCategoryEntity(categoryEntity);

		ProductEntity responseEntity = productRepository.save(entity);
		long prodId = responseEntity.getProductId();
		if (prodId > 0) {
			System.out.println("Product has been created and product id is : " + prodId);
		} else {
			System.out.println("Unable to create the product");
		}

		return prodId;
	}

	public String searchProduct(String input) {
		ProductEntity product = productRepository.findProductByProductName(input);
		String res = product.getProductName() + " " + product.getDescription() + " " + product.getQuantity();
		return res;

	}

}
