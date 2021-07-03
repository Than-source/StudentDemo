package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentRepository;
import com.student.domain.StudentAddress;
import com.student.domain.StudentDomain;
import com.student.module.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<StudentDomain> getStudent() {
		return studentRepository.findAll();
	}

	@Override
	public StudentDomain addStudent() {
		// TODO Auto-generated method stub
		StudentDomain student = new StudentDomain();
		student.setName("Than Singh");
		student.setAddress("Bharatpur");
		return studentRepository.save(student);
	}
	
}
