package com.cognizant.employeemanagementrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employee.xml")
public class EmployeeManagementRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementRestApplication.class, args);
	}
}
