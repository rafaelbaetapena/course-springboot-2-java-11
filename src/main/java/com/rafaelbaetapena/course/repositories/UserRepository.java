package com.rafaelbaetapena.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelbaetapena.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
