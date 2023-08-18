package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	@Value("${name}")
	private String name;
	@GetMapping("disp2")
	public String display()
	{
		return "my name is "+name;
	}

}
