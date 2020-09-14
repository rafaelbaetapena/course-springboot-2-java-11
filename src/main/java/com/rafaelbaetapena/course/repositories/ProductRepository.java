package com.rafaelbaetapena.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelbaetapena.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
