package com.example.emtlab2.controllersRest;

import com.example.emtlab2.model.Country;
import com.example.emtlab2.model.dto.CountryDto;
import com.example.emtlab2.services.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> findAll(){
        return this.countryService.findAll();
    }

    @PostMapping
    public ResponseEntity<Country> create(@RequestBody CountryDto countryDto){
        return this.countryService.create(countryDto)
                .map(country -> ResponseEntity.ok().body(country))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
