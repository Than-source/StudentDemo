package com.student.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.domain.StudentDomain;

@Repository
public interface StudentRepository extends JpaRepository<StudentDomain, String> {

}
