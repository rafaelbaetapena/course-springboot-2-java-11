package com.rafaelbaetapena.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelbaetapena.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
