package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.MessageEntity;

public interface MessageRepo extends JpaRepository<MessageEntity, Integer>{

}