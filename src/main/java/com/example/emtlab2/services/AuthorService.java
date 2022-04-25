package com.example.emtlab2.services;

import com.example.emtlab2.model.Author;
import com.example.emtlab2.model.dto.AuthorDto;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();
    Optional<Author> create(AuthorDto authorDto);
}
