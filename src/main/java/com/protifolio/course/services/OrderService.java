package com.protifolio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protifolio.course.entities.Order;
import com.protifolio.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findbyId(long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
