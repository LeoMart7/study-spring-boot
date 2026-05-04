package com.myprojectstudy.InventoryManagement.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.myprojectstudy.InventoryManagement.entities.Category;
import com.myprojectstudy.InventoryManagement.entities.Order;
import com.myprojectstudy.InventoryManagement.entities.Product;
import com.myprojectstudy.InventoryManagement.entities.User;
import com.myprojectstudy.InventoryManagement.entities.enums.OrderStatus;
import com.myprojectstudy.InventoryManagement.repositories.CategoryRepository;
import com.myprojectstudy.InventoryManagement.repositories.OrderRepository;
import com.myprojectstudy.InventoryManagement.repositories.ProductRepository;
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
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Marta de Jesus", "martajesus@gmail.com", "21935421911", "123456");
		User u2 = new User(null, "Maria Madalena", "mairamada@gmail.com", "21974114516", "789456");

		userRepository.saveAll(Arrays.asList(u1, u2));
		
		Product p1 = new Product(null, "Notebook a15-psk", "notebook gamer and stody", 4500.00, "");
		Product p2 = new Product(null, "Smart wathc p35 war", "practicality e durability", 560.0, "");
		Product p3 = new Product(null, "Smart TV 65' FullHD 4K", "Full resolution", 3200.0, "");
		Product p4 = new Product(null, "Ryzen 5 3600", "great for games and work", 1000.0, "");
		Product p5 = new Product(null, "Motorola G85", "Mordern, mulriplatform and practicality", 2600.0, "");
		Product p6 = new Product(null, "Bed", "Confort and practicality", 3000.0, "");
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
		
		Category c1 = new Category(null, "Eletronic"); 
		Category c2 = new Category(null, "Home"); 
		Category c3 = new Category(null, "Decoration"); 
		Category c4 = new Category(null, "Mobile"); 
		
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3, c4));
		
		p1.getCategories().add(c1);
		p1.getCategories().add(c4);
		
		p2.getCategories().add(c1);
		p2.getCategories().add(c4);
		
		p3.getCategories().add(c1);
		p3.getCategories().add(c2);
		p3.getCategories().add(c3);
		
		p4.getCategories().add(c1);
		
		p5.getCategories().add(c1);
		p5.getCategories().add(c4);

		p6.getCategories().add(c2);
		p6.getCategories().add(c3);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
		
		Order o1 = new Order(null, Instant.parse("2026-02-12T15:50:15Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2026-02-01T22:16:34Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2026-02-01T22:20:12Z"), OrderStatus.PAID, u2);
		Order o4 = new Order(null, Instant.parse("2026-02-28T16:10:11Z"), OrderStatus.DELIVERED, u1);

		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));
		
		
		
	} 
	
}
