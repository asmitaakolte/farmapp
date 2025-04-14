package com.farmer.farmapp.controller;

import com.farmer.farmapp.entity.WasteSolution;
import com.farmer.farmapp.service.WasteSolutionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waste")
@CrossOrigin(origins = "http://localhost:3001")
public class WasteSolutionController {

    private final WasteSolutionService service;

    public WasteSolutionController(WasteSolutionService service) {
        this.service = service;
    }

    @GetMapping
    public List<WasteSolution> getAll() {
        return service.getAll();
    }

    @GetMapping("/category")
    public List<WasteSolution> getByCategory(@RequestParam String category) {
        return service.getByCategory(category);
    }
}
