package com.myprojectstudy.InventoryManagement.resources;

import org.springframework.web.bind.annotation.RestController;

import com.myprojectstudy.InventoryManagement.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Bernardo", "bernardo.souza@hotmai.com", "219518520", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
