package com.punkmetal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.punkmetal.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
