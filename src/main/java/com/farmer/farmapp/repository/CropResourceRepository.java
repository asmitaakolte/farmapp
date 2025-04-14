package com.farmer.farmapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.farmer.farmapp.entity.CropResource;

import java.util.List;

public interface CropResourceRepository extends JpaRepository<CropResource, Long> {
    List<CropResource> findByCropIgnoreCase(String crop);
}
