package com.farmer.farmapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CropResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String crop;
    private String title;
    private String description;
    private String type; // e.g., Video, Article, Guide
}
