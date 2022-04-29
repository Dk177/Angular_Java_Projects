package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.Proxy.AddressMicroserviceProxy;
import com.student.Proxy.DeptMicroserviceProxy;
import com.student.Repository.StudentRepository;
import com.student.dto.AddressResponse;
import com.student.dto.DeptResponse;
import com.student.dto.StudentResponse;
import com.student.models.Student;

@RestController
public class StudentController {

	
	
	@Autowired
	private AddressMicroserviceProxy proxy;
	
	@Autowired
	private DeptMicroserviceProxy deptProxy;
	
	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/api/student")
	public Student addStudent(@RequestBody Student student) {
		return repo.save(student);
	}
	
	@GetMapping("/api/student")
	public List<Student> showAll() {
		return repo.findAll();
	}
	
	
	@GetMapping("/student/{student_id}")
	public StudentResponse getaddressById(@PathVariable int student_id) {
		
		Student student = repo.findById(student_id).get();	
		
		AddressResponse addressDetails = proxy.retrieveAddressDetails(student.getAddressId());
		
		DeptResponse deptDetails = deptProxy.getDeptById(student.getDepartmentId());
		return new StudentResponse(student.getId(),student.getName(),student.getEmail(),student.getMobile(),addressDetails.getStreet(),
				addressDetails.getCity(),addressDetails.getCountry(),deptDetails.getDepartmentCode(),deptDetails.getDepartmentName(),deptDetails.getDepartmentAddress());
	}
}
