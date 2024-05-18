package com.example.bookwormbase.backend.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private int rating;
    @ManyToOne
    private Book book;
    @ManyToOne
    private User user;
    private LocalDate date;

    // Getters and Setters
}
