package com.mastek.training.hrapp.apis;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// component identify the object which can used by other objects

import com.mastek.training.hrapp.entities.Employee;

// @Component: indicate to Spring to create an object of this class as component
// @Scope: singleton: object for application
// 			prototype: one object for each usage

@Component
@Scope("prototype")
public class EmployeeService {
	
	public EmployeeService() {
		System.out.println("Employee Service Created");
	}
	
	public Employee registerEmployee(Employee emp) {
	System.out.println("Employee Registered" + emp);
	return emp;
		}
	
	
}

