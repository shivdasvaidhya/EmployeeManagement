package com.amdocs.crudwithsttscode.app.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice // handles exception globally
public class GlobalExceptionHandler 
{
	
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorResponse> EmployeeNotFoundExceptionHandler(EmployeeNotFoundException e, HttpServletRequest request)
	{
		log.info("call ..."); 
		ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND, e.getMessage(),new Date(), request.getRequestURI());
		
		return new ResponseEntity<ErrorResponse> (error, HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> ArithmeticExceptionHandler(ArithmeticException e)
	{
		log.info("call ArithmeticException"); 
		return new ResponseEntity<String> (e.getMessage(), HttpStatus.NOT_FOUND);
		
	}
}
