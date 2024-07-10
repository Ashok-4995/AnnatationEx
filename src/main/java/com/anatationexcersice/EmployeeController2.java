package com.anatationexcersice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController2 {
	
	@Value("Ashok")
	String name;
	
	@GetMapping(value="/getvalue")
	public String getvalue() {
		return name;
	}
	
	@Value("13")
	int age;
	
	@GetMapping(value="/getage")
	public int getage() {
		return age;
	}
	
	@Value("${brand}")
	String brand;
	
	@GetMapping(value="/getbrand")
	public String getbrand() {
		return brand;
	}


}
