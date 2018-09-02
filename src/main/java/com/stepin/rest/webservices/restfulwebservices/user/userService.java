package com.stepin.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.stepin.rest.webservices.restfulwebservices.Exception.UserNotFoundException;

@RestController
public class userService {
	
	@Autowired
	public UserDaoService userDaoService;
	
	@GetMapping(path="/user/getAllUser")
	public List<User> getAllUser(){
		return userDaoService.getAllUser();
	}
	
	@GetMapping(path="/user/getCount")
	public Integer getTotalUser(){
		return userDaoService.getTotalUserCount();
	}
	
	@GetMapping(path="/user/deleteUser/{id}")
	public List<User> deleteUser(@PathVariable Integer id){
		return userDaoService.deleteUser(id);
	}
	
	@PostMapping(path="/user")
	public ResponseEntity<User> addUser(@RequestBody User user){
		userDaoService.addUserToRepo(user);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(user.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping(path="/user/{id}")
	public User getUser(@PathVariable Integer id) throws UserNotFoundException{
		User user = userDaoService.getUserById(id);
		
		if(user == null){
			throw new UserNotFoundException("no user with "+id);
		}
		return user;
	}
}
