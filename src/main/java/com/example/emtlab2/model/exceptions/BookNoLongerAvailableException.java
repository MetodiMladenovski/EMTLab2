package com.example.emtlab2.model.exceptions;

public class BookNoLongerAvailableException extends RuntimeException{
    public BookNoLongerAvailableException(Long id) {
        super(String.format("Book with id %s has 0 available copies", id));
    }
}
