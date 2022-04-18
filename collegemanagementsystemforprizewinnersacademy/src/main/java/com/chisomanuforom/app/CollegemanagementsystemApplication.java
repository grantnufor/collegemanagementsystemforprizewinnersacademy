package com.chisomanuforom.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.chisomanuforom.app.adapter.Student;

@SpringBootApplication
public class CollegemanagementsystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CollegemanagementsystemApplication.class, args);
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void run(String... args) throws Exception{
		
		
		String sql = "Select * from student;";
		
		List<Student> students = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
	 
	   students.forEach(System.out :: println);
		
	}

}
