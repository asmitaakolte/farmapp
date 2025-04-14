package com.farmer.farmapp.repository;

import com.farmer.farmapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByCropIgnoreCase(String crop);
    List<Question> findByAnswerIsNotNull(); // Only answered
}
