package com.services;

import com.model.*;
import com.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService
{

	   @Autowired
	    private QuestionRepository QuestionRepo;
	
	
	@Override
	public Question saveQuestion(Question question) {
		return QuestionRepo.save(question);
	}
	
}
