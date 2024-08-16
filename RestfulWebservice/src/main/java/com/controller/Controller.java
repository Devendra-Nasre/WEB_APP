package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/getMessage")
	public String getMessage()
	{
		return "<h1> Hello Devendra </h1>";
	}
}
