package com.mastek.training.hrapp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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

	
		 
		
		
			//-> Database
			   
			@Test
		    public void addEmployeeUsingService() {
		        emp.setEmpno(5);
		        emp.setName("New Employee");
		        emp.setSalary(5555);
		        emp = empService.registerOrUpdateEmployee(emp);
		        assertNotNull(emp);
		       
		    }
		   
		   
		    //-> FIND
		    @Test
		    public void findByEmpnoUsingService() {
		        int empno = 1;
		        assertNotNull(empService.findByEmpno(empno));
		    }
		   
		   
		    //-> DELETE
		   
		    @Test
		    public void deleteByEmpnoUsingService() {
		       
		        int empno = 2;
		        empService.deleteByEmpno(empno);
		        assertNull(empService.findByEmpno(empno));
		    }
		   
		    @Test
		    public void simpleTest() {
		        System.out.println("System Test Executed");
		    }
		    @Test 
		    public void checkFetchBySalary() {
		    	List<Employee> emps = empService 
		    			.fetchEmployeeBySalaryRange(0,3000);
		    	for (Employee employee : emps) {
		    		System.out.println(employee);
		    	}
		    	assertEquals(emps.size(),2);
		    }
			
			
		}
	
	
		
		
