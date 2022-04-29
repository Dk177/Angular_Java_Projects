package com.student.Proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.student.dto.DeptResponse;

@FeignClient(name="department-service")
public interface DeptMicroserviceProxy {
	
	@GetMapping("/department/code/{dept_id}")
	public DeptResponse getDeptById(@PathVariable String dept_id); 

}
