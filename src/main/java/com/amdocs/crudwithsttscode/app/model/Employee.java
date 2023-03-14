package com.amdocs.crudwithsttscode.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Employee 
{
	@Id
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private Integer age;
	
}
