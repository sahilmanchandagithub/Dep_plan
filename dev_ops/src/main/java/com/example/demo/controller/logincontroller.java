package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TestDAO;
import com.example.demo.modal.Employee;

@Controller
public class logincontroller {
	
	@RequestMapping(value = "/login")
	public String loginpage ()
	{
		System.out.println("You are login controller");
		return "login";
	
	}

}




