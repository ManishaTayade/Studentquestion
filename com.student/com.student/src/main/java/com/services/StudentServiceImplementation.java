package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.exception.*;
//import com.exception.NoSuchCustomerExistsException;
import com.model.*;
import com.services.*;

@Service
public class StudentServiceImplementation  implements StudentService
{

	   @Autowired
	    private StudentRepository studentRepo;

	    @Override
	    public Student saveStudent(Student student) {
	        return studentRepo.save(student);
	    }


	    @Override
	    public Student getStudent(long id) {
	        return studentRepo.findById(id).orElseThrow(() ->
	                new NoSuchStudentExistsException("No such student with id=" + id));
	    }
	    
	    @Override
	    public List<Student> find(String email) {
	        return studentRepo.findByEmail(email); // Now, it will find students by email.
	    }
	
}
