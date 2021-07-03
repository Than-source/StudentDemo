package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.domain.StudentDomain;
import com.student.module.Student;

@Service
public interface StudentService {
	List<StudentDomain> getStudent();
	StudentDomain addStudent();
	

}
