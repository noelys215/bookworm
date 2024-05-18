package com.example.bookwormbase.backend.repository;
import com.example.bookwormbase.backend.models.Book;
import com.example.bookwormbase.backend.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByBook(Book book);
}
