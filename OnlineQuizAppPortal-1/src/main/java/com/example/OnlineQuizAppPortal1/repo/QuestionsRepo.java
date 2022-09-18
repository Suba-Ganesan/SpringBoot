package com.example.OnlineQuizAppPortal1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineQuizAppPortal1.entity.Questions;


@Repository
public interface QuestionsRepo extends JpaRepository<Questions, Integer> {

}