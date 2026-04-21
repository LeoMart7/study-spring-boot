package com.myprojectstudy.InventoryManagement.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.myprojectstudy.InventoryManagement.entities.Category;
import com.myprojectstudy.InventoryManagement.entities.Order;
import com.myprojectstudy.InventoryManagement.entities.User;
import com.myprojectstudy.InventoryManagement.entities.enums.OrderStatus;
import com.myprojectstudy.InventoryManagement.repositories.CategoryRepository;
import com.myprojectstudy.InventoryManagement.repositories.OrderRepository;
import com.myprojectstudy.InventoryManagement.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Category c1 = new Category(null, "Eletronic"); 
		Category c2 = new Category(null, "Home"); 
		Category c3 = new Category(null, "Decoration"); 
		
		User u1 = new User(null, "Marta de Jesus", "martajesus@gmail.com", "21935421911", "123456");
		User u2 = new User(null, "Maria Madalena", "mairamada@gmail.com", "21974114516", "789456");
		
		Order o1 = new Order(null, Instant.parse("2026-02-12T15:50:15Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2026-02-01T22:16:34Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2026-02-01T22:20:12Z"), OrderStatus.PAID, u2);
		Order o4 = new Order(null, Instant.parse("2026-02-28T16:10:11Z"), OrderStatus.DELIVERED, u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
		
	} 
	
}
