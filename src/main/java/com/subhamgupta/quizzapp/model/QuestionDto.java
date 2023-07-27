package com.subhamgupta.quizzapp.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.function.Function;


@Data
@Builder
public class QuestionDto {
    private String questionTitle;
    private Integer id;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
}

