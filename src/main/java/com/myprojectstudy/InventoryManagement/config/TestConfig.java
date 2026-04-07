package com.myprojectstudy.InventoryManagement.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.myprojectstudy.InventoryManagement.entities.User;
import com.myprojectstudy.InventoryManagement.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Marta de Jesus", "martajesus@gmail.com", "21935421911", "123456");
		User u2 = new User(null, "Maria Madalena", "mairamada@gmail.com", "21974114516", "789456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	} 
	
}
