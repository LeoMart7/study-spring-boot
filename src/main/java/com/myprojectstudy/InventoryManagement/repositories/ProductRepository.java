package com.myprojectstudy.InventoryManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojectstudy.InventoryManagement.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
