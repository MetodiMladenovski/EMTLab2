package com.example.emtlab2.model.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super(String.format("Book with id %s was not found", id));
    }
}
