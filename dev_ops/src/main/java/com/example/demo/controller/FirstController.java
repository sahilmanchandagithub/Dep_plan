package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TestDAO;
import com.example.demo.modal.Employee;

@RestController
public class FirstController {

	@Autowired
	private TestDAO testDAO;
	
	@RequestMapping(value = "/emp",method=RequestMethod.GET)
	public Employee getEmployee(@RequestParam("id") String id)
	{
		System.out.println("This is the id: "+id);
		
		return testDAO.getEmployee(id);
		
	}
	
}
