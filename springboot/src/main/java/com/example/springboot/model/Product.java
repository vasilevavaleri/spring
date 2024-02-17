package com.example.springboot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.Id;

import jakarta.persistence.GeneratedValue;
@Data
@Entity

public class Product {
	@Id
	@GeneratedValue
	private Long Id;
	@Column(unique = true)
    private String title;
    private int price;
    private String description;

    
}