package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.model.*;
import com.services.QuestionService;
import com.services.StudentService;
import com.dao.*;


@RestController
@RequestMapping("/api/questions")
public class QuestionController 
{
	    @Autowired
	    private QuestionService questionService;

	    @Autowired
	    private QuestionRepository questionRepository;

	    @GetMapping("/test")
	    public String testEndpoint() {
	        return "Test endpoint is working!";
	    }
	    
	    @GetMapping
	    public List<Question> getAllQuestions() 
	    {
	        return questionRepository.findAll();
	    }

	    @PostMapping("/add")
	    public Question addQuestion(@RequestBody Question question) 
	    {
	        return questionRepository.save(question);
	    }

	    @PutMapping("/{id}")
	    public Question updateQuestion(@PathVariable String id, @RequestBody Question updatedQuestion) 
	    {
	        return questionRepository.findById(id).map(question -> {
	            question.setQuestionText(updatedQuestion.getQuestionText());
	            return questionRepository.save(question);
	        }).orElseThrow(() -> new RuntimeException("Question not found"));
	    }
	    
//	    
//	    @PostMapping("/add")
//	    public Question addQues1(@RequestBody Question que) {
//	        return questionService.saveQuestion(que);
//	    }
	    
	  
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	


