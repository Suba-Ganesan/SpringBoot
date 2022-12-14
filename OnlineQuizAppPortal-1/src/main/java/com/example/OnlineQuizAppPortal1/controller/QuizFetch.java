package com.example.OnlineQuizAppPortal1.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineQuizAppPortal1.entity.Questions;
import com.example.OnlineQuizAppPortal1.entity.Quiz;
import com.example.OnlineQuizAppPortal1.repo.QuestionsRepo;
import com.example.OnlineQuizAppPortal1.service.QuizService;

@RestController
@RequestMapping("/fetchquiz")
public class QuizFetch {
	 
	@Autowired
	private QuizService service;
	@Autowired
	private QuestionsRepo repo;
	
	@GetMapping("/{quizid}")
	public ResponseEntity<Object> findque(@PathVariable int quizid)
	{
		List<Quiz> resp= service.findque(quizid);
		System.out.println(resp);
	
		ArrayList<Integer> questionsid = new ArrayList<Integer>();
		
		resp.forEach(e->questionsid.add(e.getQuestionid()));
		System.out.println(questionsid);

		List<Questions> findall = repo.findAllById(questionsid);
		ArrayList<String> question = new ArrayList<String>();
		
		findall.forEach((e)->{
			question.add("Que. "+e.getQue());
			question.add("(a) "+e.getOptionA());
			question.add("(b) "+e.getOptionB());
			question.add("(c) "+e.getOptionC());
			question.add("(d) "+e.getOptionD());
			question.add("_____________________");
			
		});
		
		System.out.println(question);
		
		if(questionsid.size()!=0)
			return new ResponseEntity<Object>(question,HttpStatus.FOUND);
		else
			return new ResponseEntity<Object>("Quiz not Available",HttpStatus.NOT_FOUND);
	}
	

}