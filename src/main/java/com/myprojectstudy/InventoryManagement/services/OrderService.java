package com.myprojectstudy.InventoryManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myprojectstudy.InventoryManagement.entities.Order;
import com.myprojectstudy.InventoryManagement.repositories.OrderRepository;

@Component
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);		
		return obj.get();
	}
	
}
