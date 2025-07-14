package com.cognizant.employeemanagementrest.service;

import com.cognizant.employeemanagementrest.dao.EmployeeDao;
import com.cognizant.employeemanagementrest.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeDao dao;

    public EmployeeService(EmployeeDao dao) {
        this.dao = dao;
    }

    @Transactional
    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }
}
