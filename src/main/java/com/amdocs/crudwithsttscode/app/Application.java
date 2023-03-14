package com.amdocs.crudwithsttscode.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amdocs.crudwithsttscode.app.model.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		Employee em= new Employee();
		
	}

}
