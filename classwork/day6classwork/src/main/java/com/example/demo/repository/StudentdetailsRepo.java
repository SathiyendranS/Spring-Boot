package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentdetailsEntity;

public interface StudentdetailsRepo extends JpaRepository<StudentdetailsEntity, Integer> {
	

}
