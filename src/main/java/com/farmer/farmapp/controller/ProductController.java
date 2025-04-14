package com.farmer.farmapp.controller;

import com.farmer.farmapp.entity.Product;
import com.farmer.farmapp.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:3001")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @GetMapping("/type")
    public List<Product> getByType(@RequestParam String type) {
        return service.getByType(type);
    }

    @GetMapping("/location")
    public List<Product> getByLocation(@RequestParam String location) {
        return service.getByLocation(location);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }
}
