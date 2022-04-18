package com.chisomanuforom.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.chisomanuforom.app.adapter.Student;

@Component
public class StudentDao implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<Student> getStudent(){
		
		
		String sql = "Select * from student;";
		
		List<Student> students = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
	 
		return students;
		
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void run(String... args) throws Exception{
//		
//		
//		String sql = "Select * from student;";
//		
//		List<Student> students = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
//	 
//	 
//		
//	}
	

}
