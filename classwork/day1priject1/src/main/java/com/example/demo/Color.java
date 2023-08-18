package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	@Value("${color}")
	private String color;
	@GetMapping("disp1")
	public String myfav()
	{
		return "my fav color is "+color;
	}

}
