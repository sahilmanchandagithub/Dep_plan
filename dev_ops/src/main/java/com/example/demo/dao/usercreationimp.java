package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.modal.user;

@Repository("usercreationdao")
@Service 
public class usercreationimp implements usercreationdao  {

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
		
		 
		 
		 
		  jdbcTemplate.update( "DELETE FROM user_information WHERE username = ?", username);
				
				System.out.println(username + " :Deleted");
				
		
	}

	@Override
	public void update_user(user userobj) {
		
		jdbcTemplate.update("UPDATE user_information SET NAME = ? ,  EMAIL = ? ,  PASSWORD = ? 	 WHERE USERNAME = ? ", new Object[] { userobj.getName(),userobj.getEmail(),userobj.getPassword(),userobj.getUsername() });		
				System.out.println(userobj.getUsername() + ": Updated");
				
		// TODO Auto-generated method stub
		
	}

	@Override
	public user fetch_user(String username) {
			
    return	jdbcTemplate.queryForObject("select * from user_information where username = ?",new Object[] { username },new RowMapper<user>() {
    
  		

			@Override
			public user mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
			user obj = new user();
			
			obj.setName(rs.getString(1));
			obj.setEmail(rs.getString(2));
			obj.setUsername(rs.getString(3));
			return obj;	
				
			}  
		    }) ;  
		
	
	}	
	
	@Override
	public boolean fetchusername_password(String username ,  String Password) {
	
		
		System.out.println("we are in doa for login check");
    
    
    
    String sql = "SELECT count(*) FROM user_information WHERE username = ? and password = ?";
    System.out.println("2");
	boolean result = false;
    
	System.out.println("3"); 
   
	
	int count = jdbcTemplate.queryForObject(sql, new Object[] { username , Password }, Integer.class);

    System.out.println("4");
    
    if (count > 0) {
		result = true;
	
    
    }
	return result;
		
	
	}	
		
		

		// TODO Auto-generated method stub
		
	 

	
	public List<user> fetch_all_user() {
		
		System.out.println("fetch all user");

   
				
			return	jdbcTemplate.query("select * from user_information ",new RowMapper<user>(){  
			

			@Override
			public user mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
			user obj = new user();
			
			obj.setName(rs.getString(1));
			obj.setEmail(rs.getString(2));
			obj.setUsername(rs.getString(3));
			
			return obj;	
				
			}  
		    });   
		
	}

	

}
