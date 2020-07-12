package com.edge.service.edgeservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.edge.service.edgeservice.entity.Employee;

@FeignClient("employee-service")
public interface EmployeeWebService {

	@GetMapping("/employees")
	ResponseEntity<List<Employee>> getAllEmployees();
}
