package com.amdocs.crudwithsttscode.app.exception;

public class EmployeeNotFoundException extends RuntimeException
{
	public EmployeeNotFoundException(String msg)
	{
		super(msg);
	}
}
