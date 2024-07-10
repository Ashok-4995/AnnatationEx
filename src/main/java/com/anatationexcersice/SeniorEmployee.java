package com.anatationexcersice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("seniorEmp")
public class SeniorEmployee implements Employee {
	
	public String getmsg() {
		return "hey senior";
	}


}
