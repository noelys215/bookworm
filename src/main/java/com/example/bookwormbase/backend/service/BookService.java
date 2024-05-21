package com.example.bookwormbase.backend.service;

import com.example.bookwormbase.backend.models.Book;
import com.example.bookwormbase.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> searchBooks(String title) {
        return bookRepository.findByTitleContaining(title);
    }

    // Other methods for updating and managing books
}
