package com.example.demo.dto;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.member;

public interface memberRepo extends CrudRepository<member , Long> {
    
}
