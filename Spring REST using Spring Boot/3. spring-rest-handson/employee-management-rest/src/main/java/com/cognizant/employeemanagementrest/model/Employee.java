package com.cognizant.employeemanagementrest.model;

import lombok.Data;

import java.util.List;

@Data
public class Employee {
    private int id;
    private String name;
    private double salary;
    private boolean permanent;
    private Department department;
    private List<String> skills;
}
