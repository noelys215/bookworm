package com.example.bookwormbase.backend.models;

import java.util.Map;

public class Report {
    private int totalBooks;
    private int totalReviews;
    private double averageRating;
    private Map<String, Long> booksByGenre;

    // Getters and Setters

    public int getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public Map<String, Long> getBooksByGenre() {
        return booksByGenre;
    }

    public void setBooksByGenre(Map<String, Long> booksByGenre) {
        this.booksByGenre = booksByGenre;
    }
}
