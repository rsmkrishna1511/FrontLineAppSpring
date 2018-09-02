package com.stepin.rest.webservices.restfulwebservices.Exception;

import java.util.Date;

public class ExceptionResponse {
	
	private Date exDate;
	private String Message;
	private Integer statusCode;
	
	public ExceptionResponse() {
		super();
	}

	public ExceptionResponse(Date exDate, String message, Integer statusCode) {
		super();
		this.exDate = exDate;
		Message = message;
		this.statusCode = statusCode;
	}

	public Date getExDate() {
		return exDate;
	}

	public void setExDate(Date exDate) {
		this.exDate = exDate;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
}
