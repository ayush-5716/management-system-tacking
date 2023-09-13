package com.example.demo.dto;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.item;

public interface itemRepo extends CrudRepository<item, Long>{
    
}
