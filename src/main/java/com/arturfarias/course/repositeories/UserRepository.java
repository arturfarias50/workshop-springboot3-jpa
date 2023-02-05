package com.arturfarias.course.repositeories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturfarias.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
