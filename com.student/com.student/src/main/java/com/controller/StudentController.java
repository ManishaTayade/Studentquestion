package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dao.StudentRepository;
import com.model.*;
import com.services.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController 
{
	 @Autowired
	    private StudentRepository studentRepository;

	    @Autowired
	    private StudentService studentService;

	    @GetMapping("/test")
	    public String testEndpoint() {
	        return "Test endpoint is working!";
	    }
	    
	    @GetMapping()
	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    @PostMapping
	    public Student addStudent(@RequestBody Student student) {
	        return studentRepository.save(student);
	    }

	    @PutMapping("/{id}")
	    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
	        return studentRepository.findById(id).map(student -> {
	            student.setName(updatedStudent.getName());
	            student.setEmail(updatedStudent.getEmail());
	            return studentRepository.save(student);
	        }).orElseThrow(() -> new RuntimeException("Student not found"));
	    }

	    @PostMapping("/add")
	    public Student addStud1(@RequestBody Student student) {
	        return studentService.saveStudent(student);
	    }

	    @GetMapping("/search/{email}")
	    public List<Student> searchByEmail(@PathVariable String email) {
	        return studentService.find(email);
	    }

	    @GetMapping("/getCustomer/{id}")
	    public Student getStudent(@PathVariable("id") int id) {
	        return studentService.getStudent(id);
	    }
    
    
    
}


	
	
	


