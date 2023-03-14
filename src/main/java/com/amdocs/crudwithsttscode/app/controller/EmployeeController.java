package com.amdocs.crudwithsttscode.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.crudwithsttscode.app.exception.EmployeeNotFoundException;
import com.amdocs.crudwithsttscode.app.model.Employee;
import com.amdocs.crudwithsttscode.app.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService service;
	
	
	@GetMapping("/employee/{name}")
	public ResponseEntity<Employee> getEmployeeByEmployeeName(@PathVariable("name") String name)
	{
		Employee em= service.getEmployeeByEmployeename(name);
		
		if(em !=null)
		{
			return new ResponseEntity<Employee> (em,HttpStatus.OK);
		}
		else
		{
			throw new EmployeeNotFoundException("Employee Not Available");
		}
		
		
	}
	


	
	@RequestMapping("/getAllEmployee")
	public ResponseEntity< List<Employee> > getAllEmployee()
	{
		log.info("getEmployee");

		
		 List<Employee> employeeList = service.getAllEmployee();
		
		 if(employeeList.isEmpty())
		 {
			 return new ResponseEntity< List<Employee> >(HttpStatus.NO_CONTENT);
		 }
		 else
		 {
			 return new ResponseEntity<List<Employee>> (employeeList,HttpStatus.OK);
		 }
		 
	}
	
	 
	
	@PostMapping("/postEmployee")
	public ResponseEntity<Employee> postData(@RequestBody Employee em)
	{
		
		if(em.getEmployeeId()<1)
		{
			return new ResponseEntity<Employee> ( HttpStatus.BAD_REQUEST);
			
		}
		else
		{
			return new ResponseEntity<Employee> ( service.postEmployee(em), HttpStatus.CREATED);

		}
	
		        
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity< String> deleteEmployee(@PathVariable("id") int id)
	{
		service.deleteEmployee(id);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Employee> updataEmployee(@RequestBody Employee em, @PathVariable("id") int id)
	{
	
	
		return new ResponseEntity<Employee> (service.updateEmployee(id, em), HttpStatus.OK); 
		
	}
	
	
	
	
}
