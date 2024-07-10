package com.anatationexcersice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("juniorEmp")
public class JuniorEmployee implements Employee {
	
	public String getmsg() {
		return "hey junior";
	}

}
