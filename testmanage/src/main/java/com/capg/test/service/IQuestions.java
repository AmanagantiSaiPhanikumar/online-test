package com.capg.test.service;


import java.util.Set;

import com.capg.test.bean.Questions;
import com.capg.test.bean.Test;

public interface IQuestions {

	int addQuestion(Questions question);
	
	int updateQuestion(Questions question,int marks);
	int deleteQuestion(int questionId);
	int getResult(int questionMarks);
	Set<Integer> getAllQuestions(int id);
	
	
	
	
}
