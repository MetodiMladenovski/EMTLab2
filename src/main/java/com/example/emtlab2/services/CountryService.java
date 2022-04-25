package com.example.emtlab2.services;

import com.example.emtlab2.model.Author;
import com.example.emtlab2.model.Country;
import com.example.emtlab2.model.dto.AuthorDto;
import com.example.emtlab2.model.dto.CountryDto;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> findAll();
    Optional<Country> create(CountryDto countryDto);
    Optional<Country> getById(Long id);
}
