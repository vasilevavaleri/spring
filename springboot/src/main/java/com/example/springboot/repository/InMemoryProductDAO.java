package com.example.springboot.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

import com.example.springboot.model.Product;

@Repository
public class InMemoryProductDAO {
	private final List<Product> Products = new ArrayList<>();

	public List<Product> findAllProduct() {
		
		return Products;
				
	}

	
	public Product saveProduct(Product product) {
		Products.add(product);
		return product;
	}

	
	public Product findByTitle(String title) {
		// TODO Auto-generated method stub
		return Products.stream()
				.filter(element -> element.getTitle().equals(title))
				.findFirst()
				.orElse(null);				
	}

	
	public Product updateProduct(Product product) {
		var productIndex = IntStream.range(0, Products.size())
				.filter(index -> Products.get(index).getTitle().equals(product.getTitle()))
				.findFirst()
				.orElse(-1);
		if (productIndex > -1) {
			Products.set(productIndex, product);
			return product;
		}
		return null;
	}

	
	public void deleteProduct(String title) {
		var product = findByTitle(title);
		if (product != null) {
			Products.remove(product);
		}
	}
}
