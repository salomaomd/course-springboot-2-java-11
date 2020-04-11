package com.protifolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.protifolio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
