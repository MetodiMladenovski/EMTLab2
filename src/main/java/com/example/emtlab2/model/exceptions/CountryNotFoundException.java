package com.example.emtlab2.model.exceptions;


public class CountryNotFoundException extends RuntimeException {
    public CountryNotFoundException(Long id) {
        super(String.format("Book with id %s was not found", id));
    }
}
