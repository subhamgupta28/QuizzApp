package com.subhamgupta.quizzapp.dao;

import com.subhamgupta.quizzapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
