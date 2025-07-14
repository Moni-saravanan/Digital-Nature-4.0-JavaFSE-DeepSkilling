package com.cognizant.employeemanagementrest.controller;

import com.cognizant.employeemanagementrest.model.Department;
import com.cognizant.employeemanagementrest.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }
}
