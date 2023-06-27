package com.subhamgupta.quizzapp.controller;

import com.subhamgupta.quizzapp.model.Question;
import com.subhamgupta.quizzapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("all")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("addQuestion")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}
