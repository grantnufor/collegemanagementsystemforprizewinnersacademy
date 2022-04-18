package com.chisomanuforom.app.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chisomanuforom.app.adapter.Student;
import com.chisomanuforom.app.dao.StudentDao;


@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;

	public List<Student> getStudents() {
		
		
	  return studentDao.getStudent();
		
	
//		return Arrays.asList( new Student( "52242527282", "", "", "", "", "", "", "", "", "", "", "", 0, "", 0, "", "", LocalDate.of(2022, Month.APRIL, 25), LocalDate.of(2022, Month.APRIL, 25))
//				
//				);
	}
	

}
