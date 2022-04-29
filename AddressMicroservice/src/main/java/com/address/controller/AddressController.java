package com.address.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.address.models.Address;
import com.address.repository.AddressRepository;

@RestController
public class AddressController {

	@Autowired
	private AddressRepository repo;
	
	
	@GetMapping("/api/address")
	public List<Address> getAllAddress() {
		return repo.findAll();
	}
	
	@PostMapping("/api/address")
	public Address addNewAddress(@RequestBody Address address) {
		return repo.save(address);
	}
	
	@GetMapping("/api/address/{id}")
	public Address getaddressById(@PathVariable int id) {
		Optional<Address> address = repo.findById(id);
		if(address.isEmpty()) {
			throw new RuntimeException("Invalid Id");
		}
		
		return address.get();
	}
	
}
