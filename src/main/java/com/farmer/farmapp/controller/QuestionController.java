package com.farmer.farmapp.controller;

import com.farmer.farmapp.entity.Question;
import com.farmer.farmapp.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/qa")
@CrossOrigin(origins = "http://localhost:3001")
public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Question> getAll() {
        return service.getAll();
    }

    @GetMapping("/answered")
    public List<Question> getAnswered() {
        return service.getAnswered();
    }

    @PostMapping
    public Question askQuestion(@RequestBody Question q) {
        return service.askQuestion(q);
    }

    @PutMapping("/{id}/answer")
    public Question answerQuestion(@PathVariable Long id, @RequestBody Map<String, String> payload) {
        return service.answerQuestion(id, payload.get("answer"));
    }
}
