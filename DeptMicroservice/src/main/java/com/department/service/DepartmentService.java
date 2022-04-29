package com.department.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repo;
	
	public Department addDepartment(Department department) {
		return repo.save(department);
	}
	
	public List<Department> getAllDepartments(){
		return repo.findAll();
	}
	
	public Department getById(int id) throws Exception {
		Optional<Department> department = repo.findById(id);
		if(department.isEmpty()) {
			throw new Exception("Department not found with id:"+id);
		}
		
		return department.get();
	}
	
	public Department getByCode(String code) {
		return repo.getByDepartmentCode(code);
	}
}
