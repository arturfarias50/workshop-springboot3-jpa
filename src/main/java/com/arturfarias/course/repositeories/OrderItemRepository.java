package com.arturfarias.course.repositeories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturfarias.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
