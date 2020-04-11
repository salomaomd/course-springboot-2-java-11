package com.protifolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.protifolio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
