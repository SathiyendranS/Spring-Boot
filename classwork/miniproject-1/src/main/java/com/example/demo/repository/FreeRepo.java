package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FreeEntity;

public interface FreeRepo extends JpaRepository<FreeEntity ,Integer>{

}
