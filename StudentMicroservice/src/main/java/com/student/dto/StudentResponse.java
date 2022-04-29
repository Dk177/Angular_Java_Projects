package com.student.dto;


public class StudentResponse {
	
	private int id;
	
	private String name;

	private String email;

	private String mobile;
	

	private String street ;

	private String city ;
	private String country ;
	
	private String departmentName;
	
	private String departmentAddress;
	
	private String departmentCode;
	
	public StudentResponse() {
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public StudentResponse(int id, String name, String email, String mobile, String street, String city, String country, String departmentCode,
			String departmentName, String departmentAddress) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.street = street;
		this.city = city;
		this.country = country;
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
	}
	
	
	

	
	
}	