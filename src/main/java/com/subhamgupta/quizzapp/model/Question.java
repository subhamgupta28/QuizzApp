package com.subhamgupta.quizzapp.model;

import jakarta.persistence.*;

@Entity
public class Question {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "category")
    private String category;
    @Basic
    @Column(name = "difficulty_level")
    private String difficultyLevel;
    @Basic
    @Column(name = "option1")
    private String option1;
    @Basic
    @Column(name = "option2")
    private String option2;
    @Basic
    @Column(name = "option3")
    private String option3;
    @Basic
    @Column(name = "option4")
    private String option4;
    @Basic
    @Column(name = "question_title")
    private String questionTitle;
    @Basic
    @Column(name = "correct_answer")
    private String correctAnswer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        if (id != null ? !id.equals(question.id) : question.id != null) return false;
        if (category != null ? !category.equals(question.category) : question.category != null) return false;
        if (difficultyLevel != null ? !difficultyLevel.equals(question.difficultyLevel) : question.difficultyLevel != null)
            return false;
        if (option1 != null ? !option1.equals(question.option1) : question.option1 != null) return false;
        if (option2 != null ? !option2.equals(question.option2) : question.option2 != null) return false;
        if (option3 != null ? !option3.equals(question.option3) : question.option3 != null) return false;
        if (option4 != null ? !option4.equals(question.option4) : question.option4 != null) return false;
        if (questionTitle != null ? !questionTitle.equals(question.questionTitle) : question.questionTitle != null)
            return false;
        if (correctAnswer != null ? !correctAnswer.equals(question.correctAnswer) : question.correctAnswer != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (difficultyLevel != null ? difficultyLevel.hashCode() : 0);
        result = 31 * result + (option1 != null ? option1.hashCode() : 0);
        result = 31 * result + (option2 != null ? option2.hashCode() : 0);
        result = 31 * result + (option3 != null ? option3.hashCode() : 0);
        result = 31 * result + (option4 != null ? option4.hashCode() : 0);
        result = 31 * result + (questionTitle != null ? questionTitle.hashCode() : 0);
        result = 31 * result + (correctAnswer != null ? correctAnswer.hashCode() : 0);
        return result;
    }
}
