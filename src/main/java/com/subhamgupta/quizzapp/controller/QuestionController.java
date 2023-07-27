package com.subhamgupta.quizzapp.controller;

import com.subhamgupta.quizzapp.model.Question;
import com.subhamgupta.quizzapp.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/question")
@RequiredArgsConstructor
public class QuestionController {


    private final QuestionService questionService;
    @GetMapping("/all")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return ResponseEntity.ok(questionService.getQuestionsByCategory(category));
    }

    @PostMapping("/addQuestion")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}
