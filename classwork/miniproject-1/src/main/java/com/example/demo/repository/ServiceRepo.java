package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ServiceEntity;

public interface ServiceRepo extends JpaRepository<ServiceEntity, Integer> {

}
