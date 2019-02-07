package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.usercreationimp;
import com.example.demo.modal.user;

@Service
public class userservice {

	@Autowired
	usercreationimp usercreationimpobj;
	//method name should be small , every new name should be capital
	
	public void Addnewuser(user uobj1) {
		//uobj1 should be readable 
		usercreationimpobj.create_user(uobj1);
		
		//create_user : createUser
	}
	
	
	
       public void updateuser(user uobj1) {
		
		usercreationimpobj.update_user(uobj1);	
		
	}	
	
	
       public void deleteuser(String username) {
   		
   		usercreationimpobj.delete_user(username);	
   		
   	}
	
       
       public List<user> fetchuserall() {
      		
      	return 	usercreationimpobj.fetch_all_user();
      		
   	}
       
      public user fetchusersingle(String username) {
     		
         	return 	usercreationimpobj.fetch_user(username);
         		
  	}



	



	public boolean fetchusername_passwordservice(String userid, String password) {
		// TODO Auto-generated method stub
		
		System.out.println("first");
		
		
		return  usercreationimpobj.fetchusername_password(userid, password);
	}






    
       
   	
          
	
}
