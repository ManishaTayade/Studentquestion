package com.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.model.Question;


public interface QuestionRepository extends MongoRepository<Question, String> {
}