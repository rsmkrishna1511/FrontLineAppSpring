package com.stepin.rest.webservices.restfulwebservices;

public class HelloBean {
	
	private String message;

	public HelloBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("[Message - %S]", message);
	}
	
}
