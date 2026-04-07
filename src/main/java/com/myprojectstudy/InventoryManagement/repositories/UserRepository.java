package com.myprojectstudy.InventoryManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myprojectstudy.InventoryManagement.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
