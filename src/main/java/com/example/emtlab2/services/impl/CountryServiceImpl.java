package com.example.emtlab2.services.impl;


import com.example.emtlab2.model.Country;
import com.example.emtlab2.model.dto.CountryDto;
import com.example.emtlab2.model.exceptions.CountryNotFoundException;
import com.example.emtlab2.repository.CountryRepository;
import com.example.emtlab2.services.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return this.countryRepository.findAll();
    }

    @Override
    public Optional<Country> create(CountryDto countryDto) {
        Country country = new Country(countryDto.getName(), countryDto.getContinent());
        return Optional.of(this.countryRepository.save(country));
    }

    @Override
    public Optional<Country> getById(Long id) {
        Country country = this.countryRepository.findById(id)
                .orElseThrow(() -> new CountryNotFoundException(id));
        return Optional.of(country);
    }
}
