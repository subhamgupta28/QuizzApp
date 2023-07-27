package com.subhamgupta.quizzapp.dao;

import com.subhamgupta.quizzapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

    @Query("""
            from Question where category =:category order by random() limit :length
            """)
    List<Question> findRandomQuestion(String category, Integer length);
}
