package com.arturfarias.course.repositeories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturfarias.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
