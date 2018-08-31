package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.usercreationimp;
import com.example.demo.service.userservice;
@WebServlet(urlPatterns = "/LoginServelet/*", loadOnStartup = 1)
public class LoginServelet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	@Autowired
	private userservice userobj1;
	
	
	
	int func(String username , String password) throws ClassNotFoundException, SQLException  
	
	{	
		
	int a = 0 ;	
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sahil!123");
     Statement st=con.createStatement();
     System.out.println("connection established successfully...!!");     

     ResultSet rs=st.executeQuery("SELECT count(*) FROM user_information WHERE username = '"+ username +"' and password = '"+ password + "'");

    
        System.out.println(rs);
        rs.next();
        a = rs.getInt(1);
       
        System.out.println(a);
        return a ;

	}
	
	
	 
	public	 void doPost(HttpServletRequest request , HttpServletResponse response) throws  ServletException ,IOException 
	{
		int count =0 ;        	
		String userid = request.getParameter("username");
		String password = request.getParameter("password");
		        	
	//	 response.setContentType("text/html");
			
	//       PrintWriter out = response.getWriter();
	 //       out.println("<h3>Hello India!</h3>");
		
		

		try {
			count = func(userid, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("We are in servelet");
			
		
		System.out.println(userid);
		System.out.println(password);
		
		
	//	boolean count = userobj1.fetchusername_passwordservice(userid, password);
		
		System.out.println("11");
		
		HttpSession session = request.getSession();	
		
		System.out.println("22");
		
		if(count >0 ) {
			
			System.out.println("33");
			
			session.setAttribute("username", userid);
			response.sendRedirect("./homepage");
		}
		
		else {
			
			System.out.println("44");
			
			response.sendRedirect("/login");
			
		}
		
		System.out.println("55");
		
	}
	
		       
	
	void setlogin(String username , String password){
		
		
		
		
	}

}
