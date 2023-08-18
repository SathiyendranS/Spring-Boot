package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myname {
	@Value("${var}")
	private
	String var;
	@GetMapping("disp")
	public String dispaly()
	{
		return "My Name is "+var;
	}
	

}
