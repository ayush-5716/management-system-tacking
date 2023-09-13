package com.example.demo.dto;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.item;

public interface itemRepo extends CrudRepository<item, Long>{
    @Override
    public List<item> findAll();
}
