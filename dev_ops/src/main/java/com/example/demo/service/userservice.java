package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.usercreationimp;
import com.example.demo.modal.user;

@Service
public class userservice {

	@Autowired
	usercreationimp usercreationimpobj;
	
	public void Addnewuser(user uobj1) {
		
		usercreationimpobj.create_user(uobj1);
		
	}
	
	
	
}