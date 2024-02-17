package com.example.springboot.service.impl;

import java.util.List;


import com.example.springboot.model.Product;

public interface ProductService {
	
	List<Product> findAllProduct();
	
	Product saveProduct(Product product);
	
	Product findByTitle(String title);
	
	Product updateProduct(Product product);
	
	void deleteProduct(String title);

}