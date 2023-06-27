package com.subhamgupta.quizzapp.service;

import com.subhamgupta.quizzapp.dao.QuestionDao;
import com.subhamgupta.quizzapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }


    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Success";
    }
}
