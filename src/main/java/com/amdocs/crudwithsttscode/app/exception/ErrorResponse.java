package com.amdocs.crudwithsttscode.app.exception;


import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResponse 
{
	private int status;
	private HttpStatus error;
	private String message;
	private Date toDate;
	private String path;
	
	
}
