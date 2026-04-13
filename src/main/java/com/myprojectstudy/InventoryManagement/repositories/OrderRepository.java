package com.myprojectstudy.InventoryManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myprojectstudy.InventoryManagement.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
