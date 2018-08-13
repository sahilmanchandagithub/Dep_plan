package com.example.demo.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Employee;

@Service
public class TestDAOImpl implements TestDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Employee getEmployee(String id) {

		Employee emp = new Employee()  ;

		jdbcTemplate.query("select * from employee where id=?",  new Object[] {id},(rs,rowNum) ->{
			
			System.out.println("TESTINGGG");
			
			emp.setId(rs.getString("ID"));
			emp.setName(rs.getString("NAME"));
			return emp;
			
		});
		
		return emp;

	}

}
