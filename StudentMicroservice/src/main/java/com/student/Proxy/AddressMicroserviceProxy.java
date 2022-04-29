package com.student.Proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.student.dto.AddressResponse;

@FeignClient(name="address-service")
public interface AddressMicroserviceProxy {
	
	@GetMapping("/api/address/{address_id}")
	public AddressResponse retrieveAddressDetails(@PathVariable int address_id);

}