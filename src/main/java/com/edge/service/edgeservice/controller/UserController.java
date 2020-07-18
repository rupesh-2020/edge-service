package com.edge.service.edgeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edge.service.edgeservice.EmployeeWebService;
import com.edge.service.edgeservice.entity.User;



@RestController
public class UserController {

	@Autowired
	EmployeeWebService employeeWebService;
	
	@GetMapping("/users")
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<User>> getUserList(){
		return employeeWebService.getUserList();
	}
	
	@PostMapping("/users/register")
	@CrossOrigin(origins = "*")
	public void registerUser(@RequestBody User user){
		employeeWebService.registerUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	@CrossOrigin(origins = "*")
	public void deleteUser(@PathVariable long id){
		employeeWebService.deleteUser(id);
	}
	
	@PostMapping("/users/authenticate")
	@CrossOrigin(origins = "*")
	public User authenticateUser(@RequestBody User user){
		return employeeWebService.authenticateUser(user);
	}
	
}
