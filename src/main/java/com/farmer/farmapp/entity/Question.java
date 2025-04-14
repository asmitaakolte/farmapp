package com.farmer.farmapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String farmerName;
    private String crop;
    private String question;

    @Column(length = 2000)
    private String answer; // Optional; added by expert later
}
