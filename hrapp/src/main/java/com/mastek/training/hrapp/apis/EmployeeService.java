package com.mastek.training.hrapp.apis;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// component identify the object which can used by other objects

import com.mastek.training.hrapp.entities.Employee;
import com.mastek.training.hrapp.repositories.EmployeeRepository;

// @Component: indicate to Spring to create an object of this class as component
// @Scope: singleton: object for application
// 			prototype: one object for each usage

@Component
@Scope("prototype")
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeService() {
		System.out.println("Employee Service Created");
	}
	
	public Employee registerOrUpdateEmployee(Employee emp) {
	emp = employeeRepository.save(emp);
	System.out.println("Employee Registered" + emp);
	return emp;
		}
	
	public Employee findByEmpno(int empno) {
		// -> fetches the Employee details from DB by empno
	try {
		return employeeRepository.findById(empno).get();
		
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
	}
	
	public void deleteByEmpno(int empno) {
		employeeRepository.deleteById(empno);
	}
	
	public List<Employee> fetchEmployeeBySalaryRange(
			double min,double max) {
		return employeeRepository.findBySalary(min, max);
	}
	
	
	
	
	
	
	
}

