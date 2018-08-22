package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.modal.user;
import com.example.demo.service.userservice;

@Controller
public class Admincontroller {

	
	@Autowired
	private userservice userobj1;
	

	@RequestMapping(method = RequestMethod.POST ,value="/update")
	public void update(@RequestBody user uobj1)
	{
		
		 userobj1.updateuser(uobj1);
	}
	
	
	@RequestMapping(method = RequestMethod.POST ,value="/delete")
	public void delete(@RequestBody user uobj1)
	{
		
		 userobj1.updateuser(uobj1);
	}
	


}

