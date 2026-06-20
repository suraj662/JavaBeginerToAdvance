package com.example.inventorymanagement.repository;

import com.example.inventorymanagement.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
