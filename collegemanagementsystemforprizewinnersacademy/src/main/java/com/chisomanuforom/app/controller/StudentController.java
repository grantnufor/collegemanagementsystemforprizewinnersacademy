package com.chisomanuforom.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chisomanuforom.app.adapter.Student;
import com.chisomanuforom.app.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/student")
public class StudentController {
	

  private final StudentService studentService;
 
 	@Autowired
	public StudentController(StudentService studentService) {
	this.studentService = studentService;
 	}



	@GetMapping
	public List<Student> getStudents() {
		
	
		return studentService.getStudents();
	}
	

}