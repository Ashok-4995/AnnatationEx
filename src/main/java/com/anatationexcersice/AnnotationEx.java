package com.anatationexcersice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AnnotationEx {
	
	@GetMapping(value="/getname")
	public String getname(@RequestParam String name) {
		return "hello "+name;
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(name = "name", defaultValue = "enter your name please for valid response") String name) {
	    return "Hello, " + name + " "+" *";
	}




}
