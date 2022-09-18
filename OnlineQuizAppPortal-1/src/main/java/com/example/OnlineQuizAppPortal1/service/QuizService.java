package com.example.OnlineQuizAppPortal1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineQuizAppPortal1.entity.Quiz;
import com.example.OnlineQuizAppPortal1.repo.QuizRepo;

@Service
public class QuizService<questionsid> {
	
	@Autowired
	private QuizRepo repo;
	
	public List<Quiz> findque(int quizid) {
		List<Quiz> questionss = repo.findByQuizid(quizid);
		return questionss;
	}
	
	
	
	

	
	

	
	
	

}
