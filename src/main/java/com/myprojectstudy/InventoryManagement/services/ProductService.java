package com.myprojectstudy.InventoryManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myprojectstudy.InventoryManagement.entities.Product;
import com.myprojectstudy.InventoryManagement.repositories.ProductRepository;

@Component
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);		
		return obj.get();
	}
	
}
