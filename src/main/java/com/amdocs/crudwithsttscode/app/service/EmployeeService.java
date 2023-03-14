package com.amdocs.crudwithsttscode.app.service;

import java.util.List;

import com.amdocs.crudwithsttscode.app.model.Employee;

public interface EmployeeService
{

	public 	List<Employee> getAllEmployee();

	public Employee postEmployee(Employee emp);

	public void deleteEmployee(int id);

	public void updataEmployee(int id);

	public Employee updateEmployee(int id, Employee em);

	public Employee getEmployeeByEmployeename(String name);   

}
