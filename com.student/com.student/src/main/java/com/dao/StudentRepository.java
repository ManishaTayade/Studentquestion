package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Student;

	public interface StudentRepository extends JpaRepository<Student, Long> 
	{
		 List<Student> findByEmail(String email);
		
	}
	

