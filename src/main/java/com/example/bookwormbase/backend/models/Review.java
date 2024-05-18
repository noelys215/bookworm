package com.example.bookwormbase.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    // Getters and Setters
    @Setter
    @Getter
    private int rating;
    @ManyToOne
    private Book book;
    @ManyToOne
    private User user;
    private LocalDate date;


}
