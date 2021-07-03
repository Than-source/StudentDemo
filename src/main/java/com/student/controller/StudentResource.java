package com.student.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.domain.StudentDomain;
import com.student.module.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentResource {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public List<StudentDomain> getStudent() {
		System.out.println("Call Api");
		return studentService.getStudent();
	}
	@GetMapping("student/add")
	public StudentDomain addStudent() {
		return studentService.addStudent();
	}
}
