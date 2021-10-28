package com.punkmetal.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punkmetal.course.entities.User;
import com.punkmetal.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findByid(Long id) {
		Optional<User> op =  repository.findById(id);
		return op.get();
	}
}
