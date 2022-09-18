package com.example.OnlineQuizAppPortal1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineQuizAppPortal1.entity.Answers;

@Repository
public interface AnswersRepo extends JpaRepository<Answers, Integer>{

}