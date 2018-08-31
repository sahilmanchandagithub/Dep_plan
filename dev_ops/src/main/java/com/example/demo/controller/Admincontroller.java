package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.user;
import com.example.demo.service.userservice;

@RestController
public class Admincontroller {

	
	@Autowired
	private userservice userobj1;
	

	@RequestMapping(method = RequestMethod.POST ,value="/update")
	public void update(@RequestBody user uobj1)
	{
		
		 userobj1.updateuser(uobj1);
	}
	
	
	@RequestMapping(method = RequestMethod.POST ,value="/delete")
	public void delete(@RequestBody String username)
	{
		
		 userobj1.deleteuser(username);
	}
	
	
	@RequestMapping(value = "/alluser", method = RequestMethod.GET, produces = "application/json")
	public List<user> fetchall()
	{
		
		return userobj1.fetchuserall();
	
	}
	
	
	@RequestMapping("/user/{username}")
	public user fetchsingleuser(@PathVariable String username)
	{
		
		return userobj1.fetchusersingle(username);
	
	}
	
	
	@RequestMapping("/login/{username}/{password}")
	public boolean loginsingleuser(@PathVariable String username ,@PathVariable String password)
	{
		
		return userobj1.fetchusername_passwordservice(username, password);
	
	}
	
	


}

