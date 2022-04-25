package com.example.emtlab2.services.impl;

import com.example.emtlab2.model.Author;
import com.example.emtlab2.model.Country;
import com.example.emtlab2.model.dto.AuthorDto;
import com.example.emtlab2.model.exceptions.CountryNotFoundException;
import com.example.emtlab2.repository.AuthorRepository;
import com.example.emtlab2.services.AuthorService;
import com.example.emtlab2.services.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final CountryService countryService;

    public AuthorServiceImpl(AuthorRepository authorRepository, CountryService countryService) {
        this.authorRepository = authorRepository;
        this.countryService = countryService;
    }

    @Override
    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Optional<Author> create(AuthorDto authorDto) {
        Country country = this.countryService.getById(authorDto.getCountry())
                .orElseThrow(() -> new CountryNotFoundException(authorDto.getCountry()));
        Author author = new Author(authorDto.getName(), authorDto.getSurname(), country);
        return Optional.of(this.authorRepository.save(author));
    }
}
