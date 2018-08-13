package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.TestDAOImpl;
import com.example.demo.modal.Employee;

@SpringBootApplication
public class DevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsApplication.class, args);
	}
}
