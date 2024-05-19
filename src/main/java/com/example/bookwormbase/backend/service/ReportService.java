package com.example.bookwormbase.backend.service;

import com.example.bookwormbase.backend.models.Book;
import com.example.bookwormbase.backend.models.Report;
import com.example.bookwormbase.backend.models.Review;
import com.example.bookwormbase.backend.repository.BookRepository;
import com.example.bookwormbase.backend.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Service
public class ReportService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    public Report generateMonthlyReport() {
        Report report = new Report();

        /* Total books */
        int totalBooks = (int) bookRepository.count();
        report.setTotalBooks(totalBooks);

        /* Total reviews */
        int totalReviews = (int) reviewRepository.count();
        report.setTotalReviews(totalReviews);

        /* Average rating */
        List<Integer> ratings = reviewRepository.findAll().stream()
                .map(Review::getRating)
                .toList();
        OptionalDouble averageRating = ratings.stream().mapToInt(r -> r).average();
        report.setAverageRating(averageRating.orElse(0.0));

        /* Books by genre */
        List<Book> books = bookRepository.findAll();
        Map<String, Long> booksByGenre = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()));
        report.setBooksByGenre(booksByGenre);

        return report;
    }
}
