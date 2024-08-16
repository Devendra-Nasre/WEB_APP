package com.dps.crud1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dps.crud1.model.Customer;
import com.dps.crud1.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService service;

	@RequestMapping(value="/postData" , consumes = "application/json")
	public ResponseEntity<String> save(@RequestBody Customer c)
	{ 
		service.save(c);
		return new ResponseEntity<String>("data successfully added"	, HttpStatus.CREATED);
		
	}
	@GetMapping(value="/getData", consumes = {"application/json","application/xml"})
	public ResponseEntity<List<Customer>> getAll(){
		List<Customer> list = service.getAll();
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
		
	}
}
