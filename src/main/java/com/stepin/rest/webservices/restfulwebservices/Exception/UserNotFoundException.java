package com.stepin.rest.webservices.restfulwebservices.Exception;

public class UserNotFoundException extends Exception{
	
	public String str;

	public UserNotFoundException(String message) {
		super();
		this.str = message;
	}

	public UserNotFoundException() {
		super();
	}
	
	@Override
	public String getMessage() {
		return "FrontLineException "+str;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String message) {
		this.str = message;
	}

}
