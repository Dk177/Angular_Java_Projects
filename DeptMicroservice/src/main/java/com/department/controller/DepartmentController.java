package com.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@PostMapping("/department")
	public Department addNewDepartment(@RequestBody Department department) {
		return service.addDepartment(department);
	}
	
	@GetMapping("/department")
	public List<Department> getAllDepartments(){
		return service.getAllDepartments();
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartmentById(@PathVariable int id) throws Exception {
		return service.getById(id);
	}
	

	@GetMapping("/department/code/{code}")
	public Department getDepartmentByCode(@PathVariable String code) throws Exception {
		return service.getByCode(code);
	}
	
}
