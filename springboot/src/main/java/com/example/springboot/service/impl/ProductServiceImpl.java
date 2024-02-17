package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.springboot.model.Product;
import com.example.springboot.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Primary
public class ProductServiceImpl implements ProductService {
	private final ProductRepository repository;

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public Product findByTitle(String title) {
		// TODO Auto-generated method stub
		return repository.findProductByTitle(title);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public void deleteProduct(String title) {
		repository.deleteByTitle(title);
	}

}
