package com.cognizant.employeemanagementrest.service;

import com.cognizant.employeemanagementrest.dao.DepartmentDao;
import com.cognizant.employeemanagementrest.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentDao dao;

    public DepartmentService(DepartmentDao dao) {
        this.dao = dao;
    }

    public List<Department> getAllDepartments() {
        return dao.getAllDepartments();
    }
}
