package com.protifolio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protifolio.course.entities.Product;
import com.protifolio.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findbyId(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
