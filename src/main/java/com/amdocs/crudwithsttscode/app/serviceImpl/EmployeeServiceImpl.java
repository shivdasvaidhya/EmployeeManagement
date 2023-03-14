package com.amdocs.crudwithsttscode.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.crudwithsttscode.app.model.Employee;
import com.amdocs.crudwithsttscode.app.repository.Employeerepository;
import com.amdocs.crudwithsttscode.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	Employeerepository repo;

	@Override
	public List<Employee> getAllEmployee() 
	{

		return repo.findAll();
	}

	@Override
	public Employee postEmployee(Employee emp) 
	{
		return repo.save(emp);
	}

	@Override
	public void deleteEmployee(int id) 
	{
		repo.deleteById(id);
		
	}

	@Override
	public void updataEmployee(int id) 
	{
		repo.findById(id);
	}

	@Override
	public Employee updateEmployee(int id, Employee em) 
	{
		
	em.setEmployeeId(id);
		return repo.save(em);
	}
      @Override
	  public Employee getEmployeeByEmployeename(String name) {
	 
	  return repo.findByFirstName(name); 
	  }
	 

}
