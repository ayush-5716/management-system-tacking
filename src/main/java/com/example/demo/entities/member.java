package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long member_id;
    String name;

    int noOfPeople;

    float electricityConsumerId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public float getElectricityConsumerId() {
        return electricityConsumerId;
    }

    public void setElectricityConsumerId(float electricityConsumerId) {
        this.electricityConsumerId = electricityConsumerId;
    }
}
