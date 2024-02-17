package com.example.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import com.example.springboot.model.Product;
import com.example.springboot.service.impl.ProductService;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class Productcontroller {
	
	private final ProductService service;
	
	@GetMapping
	public List<Product> findAllProduct() {
		
		return service.findAllProduct();
		
	}
	
	@PostMapping("save_product")
	public String saveProduct(@RequestBody Product product) {
		service.saveProduct(product);
		return "Product successfully saved";
	}

	@GetMapping("/{title}")
	public Product findByTitle(@PathVariable String title) {
		return service.findByTitle(title);
	}

	@PutMapping("update_priduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("delete_product/{title}")
	public void deleteProduct(@PathVariable String title) {
		service.deleteProduct(title);
	}
	
}
