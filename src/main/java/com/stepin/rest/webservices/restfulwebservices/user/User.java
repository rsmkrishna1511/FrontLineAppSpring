package com.stepin.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
	
	private Integer id;
	private String uName;
	private String uCity;
	private Date uBirthdate;
	
	public User() {
		super();
	}
	
	public User(Integer id,String uName, String uCity, Date uBirthdate) {
		super();
		this.id = id;
		this.uName = uName;
		this.uCity = uCity;
		this.uBirthdate = uBirthdate;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuCity() {
		return uCity;
	}
	public void setuCity(String uCity) {
		this.uCity = uCity;
	}
	public Date getuBirthdate() {
		return uBirthdate;
	}
	public void setuBirthdate(Date uBirthdate) {
		this.uBirthdate = uBirthdate;
	}
	
	
}
