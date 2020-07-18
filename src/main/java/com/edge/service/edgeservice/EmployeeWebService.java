package com.edge.service.edgeservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.edge.service.edgeservice.entity.Employee;
import com.edge.service.edgeservice.entity.User;


@FeignClient("employee-service")
public interface EmployeeWebService {

	@GetMapping("/employees")
	ResponseEntity<List<Employee>> getAllEmployees();
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUserList();
	
	@PostMapping("/users/register")
	public void registerUser(User user);
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(long id);
	
	@PostMapping("/users/authenticate")
	public User authenticateUser(User user);
}
