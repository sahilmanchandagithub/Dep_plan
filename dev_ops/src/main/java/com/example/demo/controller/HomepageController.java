package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {

	

		
		@RequestMapping(value = "/homepage")
		public String loginpage ()
		{
			System.out.println("You are homepage ");
			return "homepage";
		
		}

		
		
		@RequestMapping(value = "/table")
		public String table ()
		{
			System.out.println("You are table creation page ");
			return "table";
		
		}
		
		@RequestMapping(value = "/createsheet")
		public String createSheet ()
		{
			System.out.println("You are table creation page ");
			return "done";
		
		}
		
		
		@RequestMapping(value = "/updatesheet")
		public String updateSheet ()
		{
			System.out.println("You have updated sheet ");
			return "done";
		
		}
		
		
		@RequestMapping(value = "/deletesheet")
		public String deleteSheet ()
		{
			System.out.println("You have delete sheet ");
			return "done";
		
		}
		
		
		@RequestMapping(value = "/fetchsheet")
		public String fetchsheet ()
		{
			System.out.println("You have delete sheet ");
			return "done";
		
		}
		
	
		
	}






