package com.example.bookwormbase.backend.repository;
import com.example.bookwormbase.backend.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
}