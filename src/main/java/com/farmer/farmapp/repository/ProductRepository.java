package com.farmer.farmapp.repository;

import com.farmer.farmapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTypeIgnoreCase(String type);
    List<Product> findByLocationContainingIgnoreCase(String location);
}
