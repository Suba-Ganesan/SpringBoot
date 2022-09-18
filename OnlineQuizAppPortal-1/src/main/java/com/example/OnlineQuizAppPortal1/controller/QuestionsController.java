package com.example.OnlineQuizAppPortal1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineQuizAppPortal1.entity.Questions;
import com.example.OnlineQuizAppPortal1.entity.Quiz;
import com.example.OnlineQuizAppPortal1.service.QuestionsService;

@RestController
@RequestMapping("/admin")
public class QuestionsController {
	@Autowired
	private QuestionsService service;
	
		@PostMapping("/")
		public ResponseEntity<Questions> addQuestion(@RequestBody Questions add){
			Questions question= service.addQuestion(add);
			if(question!=null)  
				return new ResponseEntity<Questions>(question,HttpStatus.CREATED);
			else
				return new ResponseEntity<Questions>(question, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		@GetMapping("/")
		public  List<Questions> getAllQuestion(){
			return service.getAllQuestion();
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<Object> deleteQuestion(@PathVariable  int id ){
			
			if(service.deleteQuestion(id))
				return new ResponseEntity<Object>("Question Deleted", HttpStatus.OK);
			else
				return new ResponseEntity<Object>("No question is not Found with number="+id,HttpStatus.NOT_FOUND);
		}
		
		@PostMapping("/createquiz")
		public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz create){
			Quiz quiz= service.addQuiz(create);
			if(quiz!=null)  
				return new ResponseEntity<Quiz>(quiz,HttpStatus.CREATED);
			else
				return new ResponseEntity<Quiz>(quiz, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	

}