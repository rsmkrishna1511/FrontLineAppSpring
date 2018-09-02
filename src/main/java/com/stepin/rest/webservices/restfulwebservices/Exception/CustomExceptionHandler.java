package com.stepin.rest.webservices.restfulwebservices.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
		ExceptionResponse exResp = new ExceptionResponse(new Date(), ex.getMessage(), 
				HttpStatus.INTERNAL_SERVER_ERROR.value());
		
		return  ResponseEntity.ok(exResp);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserException(UserNotFoundException ex, WebRequest request) throws Exception {
		ExceptionResponse exResp = new ExceptionResponse(new Date(), ex.getMessage(), 
				HttpStatus.NOT_FOUND.value());
		
		return  ResponseEntity.ok(exResp);
	}
}
