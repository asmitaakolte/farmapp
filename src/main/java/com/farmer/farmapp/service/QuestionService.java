package com.farmer.farmapp.service;

import com.farmer.farmapp.entity.Question;
import com.farmer.farmapp.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository repo;

    public QuestionService(QuestionRepository repo) {
        this.repo = repo;
    }

    public List<Question> getAll() {
        return repo.findAll();
    }

    public List<Question> getAnswered() {
        return repo.findByAnswerIsNotNull();
    }

    public List<Question> getByCrop(String crop) {
        return repo.findByCropIgnoreCase(crop);
    }

    public Question askQuestion(Question q) {
        return repo.save(q);
    }

    public Question answerQuestion(Long id, String answer) {
        Question q = repo.findById(id).orElseThrow();
        q.setAnswer(answer);
        return repo.save(q);
    }
}
