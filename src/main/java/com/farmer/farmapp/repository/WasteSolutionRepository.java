package com.farmer.farmapp.repository;

import com.farmer.farmapp.entity.WasteSolution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WasteSolutionRepository extends JpaRepository<WasteSolution, Long> {
    List<WasteSolution> findByCategoryIgnoreCase(String category);
}
