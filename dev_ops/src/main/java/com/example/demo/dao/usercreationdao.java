package com.example.demo.dao;

import java.util.List;

import com.example.demo.modal.user;

public interface usercreationdao {
	
	void create_user(user userobj);
	void delete_user(String username);
	void update_user(user userobj);
	user fetch_user (String username);
	List<user> fetch_all_user ();
	boolean fetchusername_password(String username ,String Password);

}