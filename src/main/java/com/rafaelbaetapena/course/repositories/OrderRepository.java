package com.rafaelbaetapena.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelbaetapena.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
