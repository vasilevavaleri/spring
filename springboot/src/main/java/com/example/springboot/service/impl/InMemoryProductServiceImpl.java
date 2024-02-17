package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.model.Product;
import com.example.springboot.repository.InMemoryProductDAO;
import com.example.springboot.service.ProductService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class InMemoryProductServiceImpl implements ProductService {
	private final InMemoryProductDAO repository;
	
	
	public List<Product> findAllProduct() {
		
		return repository.findAllProduct();
				
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return repository.saveProduct(product);
	}

	@Override
	public Product findByTitle(String title) {
		// TODO Auto-generated method stub
		return repository.findByTitle(title);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repository.updateProduct(product);
	}

	@Override
	public void deleteProduct(String title) {
		repository.deleteProduct(title);
		
	}
	
	

}
