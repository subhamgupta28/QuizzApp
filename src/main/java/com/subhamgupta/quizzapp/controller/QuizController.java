package com.subhamgupta.quizzapp.controller;

import com.subhamgupta.quizzapp.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @GetMapping("create")
    public ResponseEntity<?> createQuiz(
            @RequestParam String category,
            @RequestParam Integer length,
            @RequestParam String title
    ){
        return ResponseEntity.ok(quizService.createQuiz(category, length, title));
    }

    @GetMapping("getQuiz/{id}")
    public ResponseEntity<?> getQuiz(
            @PathVariable Integer id
    ){
        return ResponseEntity.ok(quizService.getQuiz(id));

    }
}
