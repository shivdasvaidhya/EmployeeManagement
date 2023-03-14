package com.amdocs.crudwithsttscode.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.crudwithsttscode.app.model.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Integer>
{
	public Employee findByFirstName(String name); 
}
