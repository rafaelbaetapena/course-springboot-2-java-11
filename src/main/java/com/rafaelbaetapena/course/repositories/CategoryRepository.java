package com.rafaelbaetapena.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelbaetapena.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
