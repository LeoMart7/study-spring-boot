package com.myprojectstudy.InventoryManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojectstudy.InventoryManagement.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
