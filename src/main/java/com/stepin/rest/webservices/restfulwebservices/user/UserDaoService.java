package com.stepin.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> userDB = new ArrayList<User>();
	private static Integer totalUser = 3;
	
	static{
		userDB.add(new User(1,"Renga","Sivakasi",new Date()));
		userDB.add(new User(2,"Sree Krishna","Sivakasi",new Date()));
		userDB.add(new User(3,"Sai Mohan","Sivakasi",new Date()));
	}
	
	public List<User> getAllUser(){
		return userDB;
	}
	
	public Integer getTotalUserCount(){
		return userDB.size();
	}
	
	public void addUserToRepo(User user){
		if(user.getId() == null){
			user.setId(++totalUser);
		}
		
		userDB.add(user);
	}
	
	public List<User> deleteUser(Integer id){
		userDB.removeIf(user -> (user.getId() == id));
		return userDB;
	}
	
	public User getUserById(Integer id){
		Optional<User> uOptional = userDB.stream()
											.filter(user -> user.getId() == id)
											.findFirst();
		return uOptional.orElse(null);
	}
}
