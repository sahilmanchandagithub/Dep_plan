package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Employee;
import com.example.demo.modal.user;


@Service
public class usercreationimp implements usercreationdao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create_user(user uobj) {
				
		
		 System.out.println( uobj.getName());
		 System.out.println( uobj.getEmail()); 
		 System.out.println( uobj.getPassword());
		 System.out.println( uobj.getUssername());
		
		 
		 
		  jdbcTemplate.update(
			    "INSERT INTO user_information (name,email,password,username)" + "VALUES (?,?,?,?)",
			    uobj.getName(),uobj.getEmail(),uobj.getPassword(),uobj.getUssername()
			);
				
				System.out.println("TESTINGGG");
				
			
	
		}
		
		// TODO Auto-generated method stub

	

	@Override
	public void delete_user() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update_user() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fetch_user() {
		// TODO Auto-generated method stub

	}

}
