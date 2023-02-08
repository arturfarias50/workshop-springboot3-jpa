package com.arturfarias.course.repositeories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturfarias.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
