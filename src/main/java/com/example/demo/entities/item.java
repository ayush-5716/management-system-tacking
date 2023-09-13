package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "employee_seq")
    Long item_id;
    
    String item_name;
    int maintenance_tenure; //in months
    int replace_time; //in months
    int maintenance_urgency; //from 1 to 10

    public String getItem_name() {
        return item_name;
    }
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }
    public int getMaintenance_tenure() {
        return maintenance_tenure;
    }
    public void setMaintenance_tenure(int maintenance_tenure) {
        this.maintenance_tenure = maintenance_tenure;
    }
    public int getReplace_time() {
        return replace_time;
    }
    public void setReplace_time(int replace_time) {
        this.replace_time = replace_time;
    }
    public int getMaintenance_urgency() {
        return maintenance_urgency;
    }
    public void setMaintenance_urgency(int maintenance_urgency) {
        this.maintenance_urgency = maintenance_urgency;
    }


}
