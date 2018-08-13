package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TestDAO;
import com.example.demo.dao.usercreationimp;
import com.example.demo.modal.user;
import com.example.demo.service.userservice;
@RestController
public class registration {

	
	@Autowired
	private userservice userobj1;
	
	
	@RequestMapping(method = RequestMethod.POST ,value="/registration")
	public void Registration(@RequestBody user uobj1)
	{
		
		 userobj1.Addnewuser(uobj1);
	}
}

