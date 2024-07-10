package com.anatationexcersice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	
//@Qualifier("seniorEmp")
@Autowired
Employee e;
	
	@GetMapping(value="/get")
	public String get() {
		return e.getmsg();
	}
	
	
	
	

}
