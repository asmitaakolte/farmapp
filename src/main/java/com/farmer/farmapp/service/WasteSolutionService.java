package com.farmer.farmapp.service;

import com.farmer.farmapp.entity.WasteSolution;
import com.farmer.farmapp.repository.WasteSolutionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteSolutionService {

    private final WasteSolutionRepository repo;

    public WasteSolutionService(WasteSolutionRepository repo) {
        this.repo = repo;
    }

    public List<WasteSolution> getAll() {
        return repo.findAll();
    }

    public List<WasteSolution> getByCategory(String category) {
        return repo.findByCategoryIgnoreCase(category);
    }
}
