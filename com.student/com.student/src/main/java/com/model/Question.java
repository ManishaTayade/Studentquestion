package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "question")
public class Question 
{
	
	
	@Id
 	private String id;
	private String questionText;

	   public Question() 
	   {
			super();
			// TODO Auto-generated constructor stub
    	}

		public Question(String id, String questionText) 
		{
			super();
			this.id = id;
			this.questionText = questionText;
	    }

		public String getId() 
		{
	        return id;
	    }

	    public void setId(String id) 
	    {
	        this.id = id;
	    }

	    public String getQuestionText() 
	    {
	        return questionText;
	    }

	    public void setQuestionText(String questionText) 
	    {
	    	  this.questionText = questionText;
	    }

		@Override
		public String toString() {
			return "QuestionEntity [id=" + id + ", questionText=" + questionText + "]";
		}
	    
	    
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


