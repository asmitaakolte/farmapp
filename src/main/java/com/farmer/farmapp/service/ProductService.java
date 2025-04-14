package com.farmer.farmapp.service;

import com.farmer.farmapp.entity.Product;
import com.farmer.farmapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public List<Product> getByType(String type) {
        return repo.findByTypeIgnoreCase(type);
    }

    public List<Product> getByLocation(String location) {
        return repo.findByLocationContainingIgnoreCase(location);
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }
}
