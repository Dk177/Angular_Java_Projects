package com.address.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "address_id")
	@SequenceGenerator(name = "address_id",initialValue = 1,allocationSize = 1)
	private int id;
	
	@NotNull
	private String street;
	
	@NotNull
	private String city;
	
	@NotNull
	private String country;
	
	public Address() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(int id, String street, String city,String country) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.country=country;
	}
	
	
}
