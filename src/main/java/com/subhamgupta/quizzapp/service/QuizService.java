package com.subhamgupta.quizzapp.service;

import com.subhamgupta.quizzapp.dao.QuestionDao;
import com.subhamgupta.quizzapp.dao.QuizDao;
import com.subhamgupta.quizzapp.model.QuestionDto;
import com.subhamgupta.quizzapp.mapper.QuestionMapper;
import com.subhamgupta.quizzapp.model.Quiz;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizDao quizDao;
    private final QuestionDao questionDao;
    private final QuestionMapper questionMapper;

    public Object createQuiz(String category, Integer length, String title) {

        var questions = questionDao.findRandomQuestion(category, length);

        var quiz = Quiz.builder()
                .title(title)
                .questions(questions)
                .build();
        return quizDao.save(quiz);
    }

    public List<QuestionDto> getQuiz(Integer id) {
        return quizDao.findById(id).orElseThrow().getQuestions().stream().map(questionMapper).toList();
    }
}
