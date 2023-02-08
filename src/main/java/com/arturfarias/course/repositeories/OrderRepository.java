package com.arturfarias.course.repositeories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturfarias.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
