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

	}





