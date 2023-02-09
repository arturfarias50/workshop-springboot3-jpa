package com.arturfarias.course.repositeories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturfarias.course.entities.OrdemItem;

public interface OrdemItemRepository extends JpaRepository<OrdemItem, Long> {

}
