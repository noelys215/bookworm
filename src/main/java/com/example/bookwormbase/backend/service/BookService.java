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

    public List<Book> searchBooks(String keyword){
        return bookRepository.findByTitleContaining(keyword);
    }

    //Other crud operations
}
