package com.stepin.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world/{name}")
	public String getGreetings(@PathVariable String name){
		return "Hello-Buddy "+name;
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloBean getBeanGreetings(){
		return new HelloBean("Hello-World-Bean");
	}
}
