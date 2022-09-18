package com.example.OnlineQuizAppPortal1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineQuizAppPortal1.entity.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer> {

		public List<Quiz> findByQuizid(int quizid);
}