package com.example.emtlab2.services;

import com.example.emtlab2.model.Book;
import com.example.emtlab2.model.Category;
import com.example.emtlab2.model.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();
    Optional<Book> findById(Long id);
    Optional<Book> edit(Long id, BookDto bookDto);
    Optional<Book> create(String name, Category category, Long authorId, Integer availableCopies);
    Optional<Book> create(BookDto bookDto);
    void deleteBook(Long id);
    void markAsTaken(Long id);
}
