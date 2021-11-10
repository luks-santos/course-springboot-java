package com.punkmetal.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punkmetal.course.entities.OrderItem;
import com.punkmetal.course.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<OrderItem> findAll() {
		return orderItemRepository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> op = orderItemRepository.findById(id);
		return op.get();
	}
}
