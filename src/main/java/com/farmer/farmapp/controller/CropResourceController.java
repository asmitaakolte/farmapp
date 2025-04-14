package com.farmer.farmapp.controller;


import org.springframework.web.bind.annotation.*;

import com.farmer.farmapp.entity.CropResource;
import com.farmer.farmapp.service.CropResourceService;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
@CrossOrigin(origins = "http://localhost:3001") // allow React
public class CropResourceController {

    private final CropResourceService service;

    public CropResourceController(CropResourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<CropResource> getByCrop(@RequestParam String crop) {
        return service.getResourcesByCrop(crop);
    }
}
