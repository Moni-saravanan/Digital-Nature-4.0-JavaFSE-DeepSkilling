package com.cognizant.employeemanagementrest.dao;

import com.cognizant.employeemanagementrest.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDao {
    private static List<Department> DEPARTMENT_LIST;

    @Autowired
    public DepartmentDao(ApplicationContext context) {
        DEPARTMENT_LIST = (List<Department>) context.getBean("departmentList");
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
