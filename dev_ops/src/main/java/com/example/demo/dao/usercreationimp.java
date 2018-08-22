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
		 System.out.println( uobj.getUsername());
		
		 
		 
		  jdbcTemplate.update(
			    "INSERT INTO user_information (name,email,password,username)" + "VALUES (?,?,?,?)",
			    uobj.getName(),uobj.getEmail(),uobj.getPassword(),uobj.getUsername()
			);
				
				System.out.println("TESTINGGG");
				
				
			
	
		}
		
		// TODO Auto-generated method stub

	@Override
	public void delete_user(String username) {
		// TODO Auto-generated method stub
		
		 
		 
		 
		  jdbcTemplate.update(
			    "DELETE FROM user_information WHERE username = ?", new Object[] { username });
				
				System.out.println(username + "Deleted");
				
		
	}

	@Override
	public void update_user(user userobj) {
		
		jdbcTemplate.update("UPDATE user_information SET NAME = ? ,  EMAIL = ? ,  PASSWORD = ? 	 WHERE USERNAME = ? ", new Object[] { userobj.name,userobj.email,userobj.password,userobj.username });		
				System.out.println(userobj.getUsername() + "Updated");
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public user fetch_user(String username) {
	
		
		/*	
		
		jdbcTemplate.update"select * from Student WHERE username = ?", new Object[] { username};
	      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return students;
		
		*/
		
		return null;
		
		
		// TODO Auto-generated method stub
		
	}

	

}
