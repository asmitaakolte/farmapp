package com.farmer.farmapp.service;

import org.springframework.stereotype.Service;

import com.farmer.farmapp.entity.CropResource;
import com.farmer.farmapp.repository.CropResourceRepository;

import java.util.List;

@Service
public class CropResourceService {

    private final CropResourceRepository repo;

    public CropResourceService(CropResourceRepository repo) {
        this.repo = repo;
    }

    public List<CropResource> getResourcesByCrop(String crop) {
        return repo.findByCropIgnoreCase(crop);
    }
}
