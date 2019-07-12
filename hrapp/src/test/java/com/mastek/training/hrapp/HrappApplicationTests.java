package com.mastek.training.hrapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mastek.training.hrapp.apis.EmployeeService;
import com.mastek.training.hrapp.entities.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HrappApplicationTests {
	
		// scan in memory all components and provide the
		// best match object in the component 
	
		@Autowired
		
		EmployeeService empService;
		
		@Autowired
		Employee emp;

	
		@Test 
		public void addEmployeeUsingService() {
		/*Employee emp = new Employee();
			emp.setEmpno(21919);
			emp.setName("Example");
			emp.setSalary(333);*/
			empService.registerEmployee(emp);
			
			
			
		}
	
	
		
		@Test 
		public void simpleTest() {
			System.out.println("System Test Executed");
		}
}
